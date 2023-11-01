package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentInfo {

    void testStudents(ArrayList<Student> al, StudentChecks sc) {
        for (Student s : al) {
            if (sc.check(s)) {
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
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.course - s2.course;
            }
        }); //анонимный класс
        System.out.println(students);

        Collections.sort(students,
                (stud1, stud2) -> stud1.course-stud2.course); //лямбда


        System.out.println(students);

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


    }
}

interface StudentChecks {
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}