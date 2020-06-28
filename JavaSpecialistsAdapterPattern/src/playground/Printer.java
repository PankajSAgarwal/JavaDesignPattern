package playground;

import java.util.Enumeration;
/** @since JDK 1.0 */
public class Printer {

    public static void print(Enumeration e){
        System.out.println("Enumeration {");
        while(e.hasMoreElements()){
            System.out.println(" " + e.nextElement());
            if(e.hasMoreElements())
                System.out.println(",");
        }
        System.out.println("}");
    }
}
