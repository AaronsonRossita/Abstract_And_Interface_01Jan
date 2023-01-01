import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        //Is a
        // Cat is a Animal
        // Dog is a Animal
        // BigDog is a Dog

        Cat cat = new Cat("Fluffy");
        Dog dog = new Dog("Rexy");
        BigDog bigDog = new BigDog("Spike");

        Parrot parrot = new Parrot("Walle");
        Plane plane = new Plane();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);


        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("One",1);
        System.out.println(hashMap.get("One"));

        Player player = new Player(DifficultyLevel.MEDIUM);

        if (player.level == DifficultyLevel.LOW){
            System.out.println("player chose an easy game");
        }else if(player.level == DifficultyLevel.HIGH){
            System.out.println("player chose a hard game");
        }else{
            System.out.println("player chose a regular game");
        }
    }

    public static void printName(Animal a){
        if (a.getClass() == Cat.class){
            Cat c = (Cat) a;
        }
        System.out.println(a.getName());
    }

    public static void stam(Flyable f){
        f.fly();
    }

}
