package exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class RegexIterable<T> implements Iterable<T>{
    // at construction, we build up a new list and add all those
    // objects whose toString() method matches the regular expression
    // Our iterator then simply walks over that list.  remove() should not be
    // allowed
    private final Iterable<T> filtered;

    public RegexIterable(Iterable<T> it, String regex) {

        // Java 10 way

        filtered = StreamSupport.stream(it.spliterator(),false)
                                .filter(t->String.valueOf(t).matches(regex))
                                .collect(Collectors.toUnmodifiableList());
        // Java 8 way
       /* ArrayList<T> temp = new ArrayList<>();
        for(T t:it){
            if(String.valueOf(t).matches(regex))
                temp.add(t);
        }

        filtered = Collections.unmodifiableCollection(temp);*/

    }
    @Override
    public Iterator<T> iterator() {
        return filtered.iterator();
    }
}
