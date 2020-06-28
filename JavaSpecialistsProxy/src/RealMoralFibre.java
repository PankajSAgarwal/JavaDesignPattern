public class RealMoralFibre implements MoralFibre {

    //very expensive to make moral fibre!
    private byte[] costOfMoralFibre = new byte[900_000];
    {
        System.out.println("Moral Fibre created !!!");
    }

    @Override
    public double actSociallyResponsible() { // AIDS orphan
        return costOfMoralFibre.length / 3;
    }

    @Override
    public double empowerEmployees() { //shares to employees
        return costOfMoralFibre.length / 3;
    }

    @Override
    public double cleanupEnvironment() { // oiled sea beds
        return costOfMoralFibre.length / 3;
    }
}
