public class Cat extends Animal {
    String voice = "meow";
    String food = "milk";
    String name = "Cat";

    public Cat(String food, String location) {
        super(food, location);
    }

    public String getLocation() {
        return location;
    }

    String location = "Home";

    @Override
    public void makeNoise() {
        System.out.println(name + " издаёт звук " + voice);
    }

    @Override
    public void eat() {
        System.out.println(name + " кушает " + food);
    }

    @Override
    public void sleep() {
        System.out.println(name + " сейчас спит");
    }
}
