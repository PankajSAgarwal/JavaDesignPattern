package playground;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHelper extends CloseHelper<Integer,
        BufferedReader,String, IOException> {



    @Override
    protected BufferedReader setUp(String[] args) throws IOException {
        return new BufferedReader(new FileReader(args[0]));
    }

    @Override
    protected Integer doExecute(BufferedReader reader, String[] args) throws IOException {
        String s;
        int lines = 0;
        while ((s = reader.readLine()) != null){
            lines++;
            System.out.printf("%05d: %s%n",lines,s);
        }
        return lines;
    }

    @Override
    protected void tearDown(BufferedReader reader, String[] args) throws IOException {
        reader.close();

    }
}
