package nested_classes.anonymous_class;

/*
- Анонимные классы не имеют имени.
- Анонимные классы это "объявление" класса и одновременное создание объекта
- В анонимных классах невозможно написать конструктор
- Анонимный класс может обращаться даже к Private элементам внешнего класса
 */
public class AnonymousClass {
    private int x = 5;
    public static void main(String[] args) {
        Math2 m = new Math2() {
            int c = 10;

            void abc() {
            }

            @Override
            public int doOperation(int a, int b) {
                AnonymousClass ac = new AnonymousClass();
                return a + b + ac.x;
            }
        };
        System.out.println(m.doOperation(3,6));
        Math2 m2 = new Math2() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };
        System.out.println(m2.doOperation(3,6));

    }
}

class Math3 {
    int doOperation (int a, int b) {
        return a/b;
    }
}
interface Math2 {
    int doOperation(int a, int b);
}
