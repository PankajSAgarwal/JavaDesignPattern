public class Demo {

    public static void main(String[] args) {
        //Company pankajSoft = new Company("pankajSoft",1_000_000,new VirtualMoralFibre());
        Company pankajSoft = new Company("pankajSoft",1_000_000,Proxies.virtual(
                MoralFibre.class,RealMoralFibre::new
        ));
        pankajSoft.makeMoney();
        pankajSoft.makeMoney();
        pankajSoft.makeMoney();

        System.out.println(pankajSoft);
        pankajSoft.damageEnvironment();
        System.out.println(pankajSoft);
        pankajSoft.becomeFocusOfMediaAttention();
        System.out.println(pankajSoft);
    }
}
