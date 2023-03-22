package InterfaceProgs.SortablePack;

interface Sortable{
    public boolean compare(Sortable ob);
    public void setData();
}

public class Person implements Sortable {
    String PersonName;
    public Person(String p){
        PersonName = p;
    }
    public boolean compare(Sortable ob){
        Person other = (Person)ob;
        return other.PersonName.compareTo(PersonName)<0;
    }
    public void setData(){
        System.out.println(PersonName);
    }
}
