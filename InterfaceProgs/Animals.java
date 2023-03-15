package InterfaceProgs;
import InterfaceProgs.AnimalsPack.*;

public class Animals {
    public static void main(String ar[]){
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        dog.speaks();
        cat.speaks();
        cow.speaks();
    }
}
