package generics.igra;

public class Test33 {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Maria", 15);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Ksenia", 19);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mikhail", 47);

        Team<Schoolar> schoolarTeam = new Team("Drakoni");
        Team<Student> studentTeam = new Team("Volki");
        Team<Employee> employeeTeam = new Team("RoboTyagi");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
        //        schoolarTeam.addNewParticipant(student2);
        //        schoolarTeam.addNewParticipant(employee1);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Schoolar> schoolarTeam2 = new Team("Mudreci");
        Schoolar schoolar3 = new Schoolar("Sergei", 12);
        Schoolar schoolar4 = new Schoolar("Olia", 14);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolarTeam.playWith(schoolarTeam2);

    }
}
