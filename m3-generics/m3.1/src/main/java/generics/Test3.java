package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        //List<Number> list = new ArrayList<Integer>(); no
        //List<Object> list = new ArrayList<Integer>(); no
        List<?> list = new ArrayList<Integer>(); // yes

        //bounded wildcard
        List<? extends Number> list30 = new ArrayList<Integer>();
        List<? super Number> list31 = new ArrayList<Object>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("Privet");
        list2.add("Ia daze");
        list2.add("Ne skuchala");
        showListInfo(list2);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.15);
        ald.add(3.16);
        System.out.println(summ(ald));

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(3);
        ali.add(365);
        ali.add(336);
        System.out.println(summ(ali));
    }

    static void showListInfo(List<?> list) {
        System.out.println("Moi list soderjit sledushit elementi:" + list);
    }

    public static double summ(ArrayList<? extends Number> list) {
        double summ=0;
        for(Number n : list) {
            summ += n.doubleValue();
        }
        return summ;
    }

}
