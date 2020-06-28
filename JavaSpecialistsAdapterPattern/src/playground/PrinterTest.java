package playground;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class PrinterTest {

    public static void main(String[] args) {
        Vector old_collections = new Vector();
        for (char c='A';c<'M';c++){
            old_collections.addElement("" + c);
        }
        Printer.print(old_collections.elements());
        String[] names = {"Erich","Richard","Ralph","John"};
        List new_collection = Arrays.asList(names);
        Printer.print(new EnumerationIterator(new_collection.iterator()));
    }


}
