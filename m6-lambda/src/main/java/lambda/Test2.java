package lambda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("privet"));
    }

    public static void main(String[] args) {
        int i = 10;
        def((String str) -> {
            System.out.println(i); //i нельзя изменять effectively  final
            return str.length();
        });
        System.out.println();
    }

}

interface I {
    int abc(String s);
}
