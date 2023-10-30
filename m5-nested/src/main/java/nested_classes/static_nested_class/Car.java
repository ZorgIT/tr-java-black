package nested_classes.static_nested_class;

public class Car {
    /*
    - static nested класс очень похож на обычный внешний, но находится внутри
    другого класса
    - Создавая объект static nested класс, нужно указывать и класс,
    содержащий его
    - static nested класс может содержать static и non-static элементы
    - static nested класс может обращаться даже к private элементам внешнего
    класс, но только к static
    - Внешний класс может обращаться даже к Private элементам static nested
    класса.
     */

    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method() {
        System.out.println(Engine.countOfObjects);
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    interface  I{}

    public static class Engine {
        private int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            System.out.println(a);
//            System.out.println(doorCount);
            this.horsePower = horsePower;
            countOfObjects++;
        }

        @Override
        public String toString() {
            return "My Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);
        Car car = new Car("red", 2, engine);
        System.out.println(car);
        car.method();
    }
}

class Z extends Car.Engine{
        Z (){super(200);}
}