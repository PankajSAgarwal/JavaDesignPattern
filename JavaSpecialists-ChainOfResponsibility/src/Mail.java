public class Mail {
    private final String from;
    private final String title;
    private final String msg;

    public Mail(String from, String title, String msg) {
        this.from = from;
        this.title = title;
        this.msg = msg;
    }

    public String getFrom() {
        return from;
    }

    public String getTitle() {
        return title;
    }

    public String getMsg() {
        return msg;
    }
}
