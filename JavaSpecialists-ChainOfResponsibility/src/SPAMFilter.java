public class SPAMFilter extends MailFilter {

    public SPAMFilter(MailFilter next) {
        super(next);
    }

    @Override
    public void handleMail(Mail mail) {
        if(mail.getFrom().contains("aol.com")){
            return;
        }
        super.handleMail(mail);
    }
}
