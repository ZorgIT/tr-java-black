package generics.igra;

public class Participant {
    private String name;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
