package InterfaceProgs.SortablePack;

public class Book {
    String BookName;
    public Book(String b){
        BookName = b;
    }
    public boolean compare(Sortable ob){
        Book other = (Book)ob;
        return other.BookName.compareTo(BookName)<0;
    }
    public void setData(){
        System.out.println(BookName);
    }
}
