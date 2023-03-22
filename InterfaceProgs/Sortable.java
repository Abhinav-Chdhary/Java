package InterfaceProgs;

import InterfaceProgs.SortablePack.*;

public class Sortable {
    public static void main(String ar[]){
        Person[] people = {
            new Person("Alice"),
            new Person("Bob"),
            new Person("Charlie")
        };

        Book[] books = {
            new Book("Harry Potter"),
            new Book("Lord of the Rings"),
            new Book("The Great Gatsby")
        };

        Movie[] movies = {
            new Movie("Inception"),
            new Movie("The Matrix"),
            new Movie("Pulp Fiction")
        };
        //Arrays.sort(people);
        //Arrays.sort(books);
        //Arrays.sort(movies);

        for(int i=0; i<3; i++){
            people[i].setData();
        }
        for(int i=0; i<3; i++){
            books[i].setData();
        }
        for(int i=0; i<3; i++){
            movies[i].setData();
        }
    }
}
