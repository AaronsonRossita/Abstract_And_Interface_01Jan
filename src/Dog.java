public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    //Overload
    public void greets(Dog another) {
        System.out.println("Woooof");
    }


}
