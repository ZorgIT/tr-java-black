package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        System.out.println("ArrayList = " + arrayList1);

        List<Integer> list1 = List.of(3, 8, 13); //возвращает
        // немодифициуремый список. элемент Null не хранит.
        System.out.println(list1);

        //list1.add(100);

        List<String> list2= List.copyOf(arrayList1);
        System.out.println(list2);

//        Object[] array = arrayList1.toArray();
//        String[] array2 = arrayList1.toArray(new String[0]);
//
//        for (String s:array2
//             ) {
//            System.out.println(s);
//
//        }
//        List<String> myList = arrayList1.subList(1,4);//предаствление листта
//        System.out.println("Sub list = " + myList);
//        myList.add("Fedor");
//        System.out.println("Sub list = " +  myList);
//        System.out.println("ArrayList = " + arrayList1);
//        arrayList1.add("Sveta");
//        System.out.println("ArrayList = " + arrayList1);
//        System.out.println("Sub list = " + myList); //недопустимо после
        // корректировки Arraylist

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Ivan");
//        arrayList2.add("Maria");
//        arrayList2.add("Igor");
//
////        arrayList1.retainAll(arrayList2); //removeAll похожий
////        System.out.println(arrayList2);
//
//        boolean result = arrayList1.containsAll(arrayList2);
//        System.out.println(result);





    }
}
