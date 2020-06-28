public class Demo {

    public static void main(String[] args) {
        BigCompany bc = new BigCompany();

        Employee pankaj = new Employee();
        System.out.println("pankaj = " + pankaj); // salary=1000, balance=2000, position=TESTER
        
        bc.pay(pankaj);
        System.out.println("pankaj = " + pankaj);//salary=1000, balance=3000, position=TESTER
        
        bc.promote(pankaj);
        System.out.println("pankaj = " + pankaj);//salary=1400, balance=3000, position=PROGRAMMER
        
        bc.pay(pankaj);
        System.out.println("pankaj = " + pankaj);//salary=1400, balance=4400, position=PROGRAMMER
        bc.pay(pankaj);
        System.out.println("pankaj = " + pankaj);//salary=1400, balance=5800, position=PROGRAMMER

        bc.promote(pankaj);
        System.out.println("pankaj = " + pankaj);//salary=4200, balance=5800, position=MANAGER}
        
        bc.undo(pankaj);
        System.out.println("pankaj = " + pankaj);//salary=1400, balance=5800, position=PROGRAMMER
        bc.undo(pankaj);
        System.out.println("pankaj = " + pankaj);//salary=1400, balance=4400, position=PROGRAMMER
        
        bc.pay(pankaj);
        System.out.println("pankaj = " + pankaj);//salary=1400, balance=5800, position=PROGRAMMER
        bc.pay(pankaj);
        System.out.println("pankaj = " + pankaj);//salary=1400, balance=7200, position=PROGRAMMER

        bc.promote(pankaj);
        System.out.println("pankaj = " + pankaj);//Employee{salary=4200, balance=7200, position=MANAGER}
        bc.pay(pankaj);
        System.out.println("pankaj = " + pankaj);//salary=4200, balance=11400, position=MANAGER
    }
}
