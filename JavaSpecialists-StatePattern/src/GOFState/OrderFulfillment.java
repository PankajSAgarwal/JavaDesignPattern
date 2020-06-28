package GOFState;

public class OrderFulfillment {

    private State state = new StartState();
    public void accepted(){
        state.accepted();
    }

    public void printDocument(){
        state.printDocument();
    }

    public void setState(State newState) {
        System.out.println(state + " -> " + newState);
        this.state = newState;
    }

    private void printQuote(){
        System.out.println("Printing Quote");
    }

    private void printInvoice(){
        System.out.println("Printing Invoice");
    }

    private class StartState extends State {
        void printDocument(){
            printQuote();
            setState(new QuotedState());
        }
    }
    private class QuotedState extends State{
        void accepted(){
            setState(new WorkingState());
        }

        void printDocument(){
            printQuote();
        }
    }

    private class WorkingState extends State {
        void printDocument() {
            printInvoice();
            setState(new InvoicedState());
        }
    }
    private class InvoicedState extends State{
        void accepted(){
            setState(new EndState());
        }
        void printDocument(){
            printInvoice();
        }
    }

    private class EndState extends State{

    }
}
