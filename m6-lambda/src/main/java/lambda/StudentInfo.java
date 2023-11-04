package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {

    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
//    void printStudentsOverGrade(ArrayList<Student> al, double grade) {
//        for (Student s : al
//        ) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> al, int age) {
//        for (Student s : al
//        ) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> al, int age,
//                                   double grade, char sex) {
//        for (Student s : al
//        ) {
//            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//
//    }

}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();




//        //пример function
//        Function<Student, Double> f = student -> student.avgGrade;

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.course - s2.course;
//            }
//        }); //анонимный класс
////        System.out.println(students);
////
////        Collections.sort(students,
//////                (stud1, stud2) -> stud1.course-stud2.course); //лямбда
//        System.out.println(students);

//        info.testStudents(students, new CheckOverGrade());
//        System.out.println("----------------------");
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age < 30;
//            }
//        });
//        System.out.println("----------------------");
//        info.testStudents(students, (Student s) -> {
//            return s.age < 30;
//        });
//        System.out.println("----------------------");
////        info.testStudents(students, (Student s) -> {
////            return s.avgGrade > 8;
////        }); // более полный способ записи лямбды
//        info.testStudents(students, p -> p.avgGrade > 8); // самый короткий
//        // способ лямбды
//
//        info.testStudents(students, p -> {
//            System.out.println("hello ");
//            return p.avgGrade > 8;
//        });
//
//        StudentChecks sc = (Student s) -> {
//            return s.avgGrade > 8;
//        }; //вынос лямбды в переменнюу
//
//        info.testStudents(students, sc);
//
//
//
//        System.out.println("----------------------");
//        info.testStudents(students, (Student s) -> {
//            return s.age > 20 && s.avgGrade < 9.3 && s.sex == 'f';
//        });


        //PREDICATE

/*
        info.testStudents(students, (Student p) -> {
            return p.avgGrade > 8;
        });

        info.testStudents(students, p -> {
            System.out.println("hello");
            return p.avgGrade > 8;
        });*/

//
//        //Объединение
//        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
//        Predicate<Student> p2 = student -> student.sex == 'm';
//
//
//        //info.testStudents(students, p1.and(p2));
//        //info.testStudents(students, p1.negate())); //negate инвертирует фильтр
//        info.testStudents(students, p1.or(p2));

/*
        System.out.println("----------------------");

        info.testStudents(students, (Student p) -> {
            return p.age < 30;
        });

        System.out.println("----------------------");
        info.testStudents(students,
                (Student p) -> {
                    return p.age > 20 && p.avgGrade < 9.3 && p.sex == 'f';
                });
                */

        //function
        Function<Student, Double> f = student -> student.avgGrade;
        double res = avgOfSmth(students, student -> (double) student.age);
        System.out.println(res);

    }

    private static double avgOfSmth(List<Student> list, Function<Student,
            Double> f) {
        double result = 0;
        for (Student st : list
        ) {
            result += f.apply(st); // у ф инт Function есть метод apply
        }
        result = result / list.size();
        return result;

    }
}

//interface StudentChecks {
//    boolean check(Student s);
//}

//class CheckOverGrade implements StudentChecks {
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade > 8;
//    }
//}