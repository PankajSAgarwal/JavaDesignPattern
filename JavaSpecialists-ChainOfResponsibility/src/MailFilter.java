public abstract class MailFilter {
    private final MailFilter next;

    public MailFilter(MailFilter next) {
        this.next = next;
    }

    public void handleMail(Mail mail){
        if(next != null){
            next.handleMail(mail);
        }
    }
}
