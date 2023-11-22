package stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,2,3);
//        stream1.filter(el -> {
//                System.out.println("!!!");
//                return el%2==0;
//        }).collect(Collectors.toList());

        Stream<Integer> stream5 = Stream.of(1,2,3,4,5,1,2,3);
//        stream5.distinct().forEach(System.out::println); //уникальные элементы

        System.out.println(stream5.count());
        System.out.println(stream5.distinct().count());//стрим нельзя
        // переиспользовать



    }
}
