public class VirtualMoralFibre implements MoralFibre {
    private MoralFibre realSubject;
    private MoralFibre realSubject(){

        if (realSubject == null){

            realSubject = new RealMoralFibre();
        }

        return realSubject;
    }
    @Override
    public double actSociallyResponsible() {
        return realSubject().actSociallyResponsible();
    }

    @Override
    public double empowerEmployees() {
        return realSubject().empowerEmployees();
    }

    @Override
    public double cleanupEnvironment() {
        return realSubject().cleanupEnvironment();
    }
}
