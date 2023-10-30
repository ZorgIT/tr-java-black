package nested_classes.inner_class;


/*
INNER КЛАСС
- Каждый объект Inner класса всегда ассоциируется с объектом внешнего класса
- Создавая объект inner класса, нужно перед этим создать объект его внешнего
класса
- Inner класс может содержать только non-static элементы
- Inner класс может обращаться даже к private элементам внешнего класса
- Внешний класс может обращаться даже к private элементам Inner класса,
прежде создав его объект
 */
public class Car {

    String color;
    int doorCount;
    Engine engine; //поле inner класса

    public Car(String color, int doorCount) {
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower); // создание объекта
//        // Inner класса.
    }

    public void setEngine(Engine newEngine) {
        this.engine = newEngine;
    }


    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    interface I {
    }

    public class Engine { //inner класс
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
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
//        Car.Engine engine = new Car.Engine(256); для статичного варианта.
//        Car car = new Car("Black", 4, 300);
        Car car = new Car("Black", 4);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);

        Car.Engine engine3 = new Car("yellow",4).new Engine(200);

        //        Car.Engine engine2 = new car.Engine(150);//нелзя


    }
}
