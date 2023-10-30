package nested_classes.local_inner_class;


/*
- Local inner класс располагается в блоках кода таких, как, например, метод
или конструктор
- Local inner класс не может быть static
- Область видимости Local inner класса - это блок, в котором он находится
- Local inner клас может обращаться даже к private элементам внешнего класса.
- Local inner класс может обращаться к элементам блока, в котором он написан
при условии, что они final или effectively final
 */

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(21, 4);
    }

}

class Math {
    private int a = 10;

    public void getResult(final int delimoe, final int delitel) {
//        int delimoe = 21;
        class Delenie {

//            private int delimoe;
//            private int delitel;

//            public int getDelimoe() {
//                return delimoe;
//            }
//
//            public void setDelimoe(int delimoe) {
//                this.delimoe = delimoe;
//            }

//            public int getDelitel() {
//                return delitel;
//            }
//
//            public void setDelitel(int delitel) {
//                this.delitel = delitel;
//            }

            public int getChastnoe() {
                return delimoe / delitel;
            }

            public int getOstatok() {
                System.out.println(a);
                return delimoe % delitel;
            }
        }
        Delenie delenie = new Delenie();
//        delenie.setDelimoe(21);
//        delenie.setDelitel(4);
//        System.out.println("Delimoe = " + delenie.getDelimoe());
        System.out.println("Delimoe = " + delimoe);
        System.out.println("Delimoe = " + delitel);
        System.out.println("Delimoe = " + delenie.getChastnoe());
        System.out.println("Delimoe = " + delenie.getOstatok());
    }
}
