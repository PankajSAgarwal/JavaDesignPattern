package playground;



public class SecurityModule {
    private final static SecurityModule instance =
            new SecurityModule();

    public static SecurityModule getInstance(){
        return instance;
    }

    private SecurityModule(){
        loadPasswords();
    }

    private void loadPasswords() {

    }

    public UserContext login(String username,String password){
        return new UserContext(username,password);
    }


}

