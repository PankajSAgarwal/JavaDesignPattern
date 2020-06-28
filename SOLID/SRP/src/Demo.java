import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        Journal j = new Journal();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug");

        System.out.println(j);
        Persistence p = new Persistence();
        String filename = "/Users/pankajagarwal/Trainings/JavaDesignPatterns/SOLID/SRP/out/production/journal.txt";
        p.saveToFile(j,filename,true);
       // Runtime.getRuntime().exec("notepad.exe " + filename);


    }
}
