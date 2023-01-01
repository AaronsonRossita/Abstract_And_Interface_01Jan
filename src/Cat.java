public class Cat extends Animal{



    public Cat(String name) {
        super(name);
    }

    public void jumpHigh(){
        System.out.println("this cat is jumping");
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }


}
