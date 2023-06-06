package EndTermWork;
import java.util.HashSet;
import java.util.TreeSet;

public class HashAndTree {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(88);
        hashSet.add(1);
        hashSet.add(100);

        System.out.println("HashSet elements:");
        for (int element : hashSet) {
            System.out.println(element);
        }

        System.out.println("--------------------------");

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(10);

        System.out.println("TreeSet elements:");
        for (int element : treeSet) {
            System.out.println(element);
        }
    }
}

