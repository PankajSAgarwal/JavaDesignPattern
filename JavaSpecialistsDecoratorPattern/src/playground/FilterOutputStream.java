package playground;

import java.io.IOException;
import java.io.OutputStream;

public class FilterOutputStream extends OutputStream {
    protected final OutputStream out;

    public FilterOutputStream(OutputStream out) {
        this.out = out;
    }

    @Override
    public void write(int b) throws IOException {
        out.write(b);
    }



    @Override
    public void close() throws IOException {
        out.close();
    }
}
