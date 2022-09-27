public class Horse extends Animal {
    String voice = "neigh";
    String food = "hay";
    String name = "Horse";
    String location = "Home";

    public Horse(String food, String location) {
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
