public class BankAccount {

    private final Log log;
    private int balance;
    public BankAccount(Log log) {
        this.log = log;
    }

    public void deposit(int amount){
        balance += amount;
        log.info("Deposited " + amount);
    }

}
