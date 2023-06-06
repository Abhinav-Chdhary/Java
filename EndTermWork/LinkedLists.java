package EndTermWork;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Insert elements at the end of the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");

        // Insert an element at a specific position
        linkedList.add(1, "Orange");

        // Print the elements of the LinkedList
        System.out.println("Elements in the LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        System.out.println("--------------------------");

        // Remove an element from the LinkedList
        linkedList.remove("Banana");

        // Remove an element at a specific position
        linkedList.remove(0);

        // Print the elements of the LinkedList after deletion
        System.out.println("Elements in the LinkedList after deletion:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}

