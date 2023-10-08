package generics;

public class ParametrizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Privet");
//        System.out.println(info1);
//        String s = info1.getValue();
//
//        Info<Integer> info2 = new Info<>(18);
//        System.out.println(info2);
//        Integer s1  = info2.getValue();

//        Info<Buss> info3 = new Info<>(new Buss());
//        System.out.println(info3);
//        Buss b1 = info3.getValue();

        Info<Integer> info4 = new Info<>(18);
        System.out.println(info4);
        Integer d1  = info4.getValue();

        Info<Double> info5 = new Info<>(3.14);
        System.out.println(info5);
        Double d13  = info5.getValue();
    }

//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//    public void abc(Info<Integer> info) {
//        Integer s = info.getValue();
//    }

}


class Info <T extends Number>{
    private T value;
    public Info(T value) {
        this.value = value;
    }
    public String toString() {
        return "{ [" + value + " ] }";
    }

    public T getValue() {
        return value;
    }
}

//interface  I1{}
//interface  I2{}

//class Parent {
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//}
//
//class Child  extends Parent {
//    public void abc(Info<Integer> info) {
//        String s = info.getValue();
//    }
//}

class Buss {

}