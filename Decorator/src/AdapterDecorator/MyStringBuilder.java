package AdapterDecorator;

public class MyStringBuilder {
    private StringBuilder sb ;

    public MyStringBuilder() {
        this.sb = new StringBuilder();
    }

    public MyStringBuilder(String str) {
        sb = new StringBuilder(str);
    }


}
