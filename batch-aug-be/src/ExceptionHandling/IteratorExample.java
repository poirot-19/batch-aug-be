package ExceptionHandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        Iterator<Integer> iterator = l.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            System.out.println("Element is " + i);

        }
    }
}
