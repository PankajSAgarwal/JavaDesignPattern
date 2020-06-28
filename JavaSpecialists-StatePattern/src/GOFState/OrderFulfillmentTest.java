package GOFState;

public class OrderFulfillmentTest {
    public static void main(String[] args) {
        OrderFulfillment process = new OrderFulfillment();
        process.printDocument();
        // they loose the document and request a reprint
        process.printDocument();
        process.accepted();
        // we now start working on the job..
        process.printDocument();
        process.accepted();
        //if we print a document , now we will get an exception
        process.printDocument();

    }
}
