package Proxy.app;

public class RealPasswordAuthenticate implements PasswordAuthenticate {
    private String password;
    public RealPasswordAuthenticate(String pass) {
        this.password=pass;
        loadPass(password);
    }
    @Override
    public void authenticatePass() {
        if (this.password == "csci2020uisawesome!") {
            System.out.println("Password Authenticated. Access Granted.");
        }
        else {
            System.out.println("Password Incorrect. Authentication failed.");
        }
    }
    private void loadPass(String password) {
        System.out.println("System authenticating password...");
    }
}
