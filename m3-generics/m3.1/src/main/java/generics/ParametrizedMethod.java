package generics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(5);
        al1.add(36);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);


        ArrayList<String> al2 = new ArrayList<>();
        al2.add("dfs");
        al2.add("dewrwerwer");
        al2.add("dsfdfs");
        al2.add("sdfrvvz");
        String b = GenMethod.getSecondElement(al2);
        System.out.println(b);
    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}


