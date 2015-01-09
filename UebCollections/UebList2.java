package UebCollections;

import java.util.Collections;
import java.util.LinkedList;

public class UebList2 {
	public static void main(String[] args) {
		LinkedList arrl = new LinkedList();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println(arrl);
        arrl.addFirst("first element");
        System.out.println("After addFirst operation:");
        System.out.println(arrl);
        arrl.removeFirst();
        System.out.println("After removeFirst operation:");
        System.out.println(arrl);
        
        Collections.sort(arrl);
        System.out.println("nach Sortierung");
        System.out.println(arrl);
	}
}
