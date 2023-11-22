package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");
        System.out.println(list);
//        //старый сопособ
//        List<String> list1 = new ArrayList<>(list);
//        for (int i = 0; i <list.size(); i++) {
//            list1.set(i,String.valueOf(list.get(i).length()));
//        }
//        System.out.println(list);
//        System.out.println(list1);

        // .map = 6 9 2 4
        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list2);

        int[] array = {5, 9, 3, 8, 1};
        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;//необходим возврат т.к. интерфейс Function
        }).toArray();
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");
        System.out.println(set);
        Set<Integer> set2 =
                set.stream().map(e -> e.length()).collect(Collectors.toSet());
        List<Integer> list3 =
                set.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println(set2);
        System.out.println(list3);


    }

    public static String getOrDefault(List<String> list, int ind, String defaultValue) {
        if (list.size() <ind) {
            return list.get(ind);
        } else
        return defaultValue;
    }
}
