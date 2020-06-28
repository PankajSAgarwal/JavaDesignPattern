package playground;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class IteratorTest {

    public static void main(String[] args) {
        //Vector<String> names = new Vector<>();
        Collection<String> names = ConcurrentHashMap.newKeySet();
        names.add("Susie");
        Iterator<String> it1=names.iterator();
        names.add("Peter");
        while(it1.hasNext()){
            System.out.println("it1.next() = " + it1.next());

        }
        Collections.addAll(names,"John","Anton","Pankaj","Zach");
        //Java - 8
        //names.removeIf(s->s.contains("n"));
        // The below code is not safe as vector enumeration doesn't know when an item has been removed from collection.
//        Enumeration<String> en = names.elements();
//        while(en.hasMoreElements()){
//            String name = en.nextElement();
//            if(name.contains("n"))
//                names.remove(name);
//        }

        // Iterator
        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            String name = it.next();
            if(name.contains("e"))
                names.remove(name); // ConcurrentModification Exception
        }
        System.out.println("names = " + names);
    }

}
