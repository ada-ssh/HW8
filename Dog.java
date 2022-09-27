public class Dog extends Animal {
    String voice = "woof";
    String food = "bone";
    String name = "Dog";
    String location = "Home";

    public Dog(String food, String location) {
        super(food, location);
    }

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
