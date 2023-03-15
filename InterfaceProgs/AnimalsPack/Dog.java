package InterfaceProgs.AnimalsPack;

interface Animal{
    public void speaks();
}

public class Dog implements Animal {
    public void speaks(){
        System.out.println("BOWWOW");
    }
}
