public class Main {
    public static void main(String[] args) {
        main3();
    }

    public static void main1() {
        Phone a = new Phone("+375291392780", "samsung", 540);
        Phone b = new Phone("+375333599783", "xiaomi", 240);
        Phone c = new Phone("+375291392756", "apple", 740);
        a.receiveCall(b);
        a.receiveCall(c.getNumber(), c.getName());
        System.out.println(c.getNumber());
        System.out.println(b.getNumber());
        System.out.println(a.getNumber());
        a.sendMessage(b, c);
    }

    public static void main2() {
        Patient patient1 = new Patient("denis", 3);
        Patient patient2 = new Patient("aida", 2);
        Patient patient3 = new Patient("katya", 1);
        Plan testPlan = new Plan();
        testPlan.save(patient1);
        testPlan.save(patient2);
        testPlan.save(patient3);

        testPlan.info(0);
    }

    public static void main3() {
        Animal[] animals = new Animal[3];
        Dog dog = new Dog("bone", "home");
        Cat cat = new Cat("milk", "home");
        Horse horse = new Horse("hay", "home");
        Veterinar a = new Veterinar();
        a.treatAnimal(cat);
    }

    public static void main4() {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red", 2, 3, 20);
        shapes[1] = new Rectangle("blue", 3, 20, 15, 7);
        shapes[2] = new Circle("black", 4, 5, 17);

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}