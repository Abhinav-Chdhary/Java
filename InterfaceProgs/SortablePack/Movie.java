package InterfaceProgs.SortablePack;

public class Movie implements Sortable {
    String MovieName;
    public Movie(String m){
        MovieName = m;
    }
    public boolean compare(Sortable ob){
        Movie other = (Movie)ob;
        return other.MovieName.compareTo(MovieName)<0;
    }
    public void setData(){
        System.out.println(MovieName);
    }
}
