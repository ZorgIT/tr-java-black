package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("234");
//        list.add(34);
//        list.add(new StringBuilder("dfdf"));
        list.add("privet");
        list.add("poka");
        list.add("ok");
        list.add("sdfaasd");
//        for (Object o: list) {
//            System.out.println(o + " dlina " + ((String)o).length());
//        }

        System.out.println();
        list.stream().forEach(System.out::println);


    }

}
