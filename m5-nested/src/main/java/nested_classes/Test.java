package nested_classes;

public class Test {
    static class A{} //статичный nested класс
    class B{}

    void method () {
        class C{} //локальный класс
    }

    //и анонимные классы
}
