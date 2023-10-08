package generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Fff", 22);
        System.out.println("Znacheniya pari: value1 = "
                +  pair1.getFirstValue() + " value2 = " + pair1.getSecondValue());

        Pair<Integer, Double> pair2 = new Pair<>(156 , 3.14);
        System.out.println("Znacheniya pari: value1 = "
                +  pair2.getFirstValue() + " value2 = " + pair2.getSecondValue());

        OtherPair<String> pair3 = new OtherPair<>("Privet", "Poka");
        System.out.println("Znacheniya pari: value1 = "
                +  pair3.getFirstValue() + " value2 = " + pair3.getSecondValue());
    }

}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}

class OtherPair<V1> {
    private V1 value1;
    private V1 value2;

    public OtherPair(V1 value1, V1 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V1 getSecondValue() {
        return value2;
    }
}
