public class Parrot extends Animal implements Flyable{


    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("This parrot is flying");
    }
}
