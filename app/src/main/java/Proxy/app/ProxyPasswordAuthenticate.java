package Proxy.app;

public class ProxyPasswordAuthenticate implements PasswordAuthenticate {
    private RealPasswordAuthenticate realPass;
    private String password;

    public ProxyPasswordAuthenticate(String pass) {
        this.password=pass;
    }

    @Override
    public void authenticatePass() {
        if (realPass == null) {
            realPass = new RealPasswordAuthenticate(password);
        }
        realPass.authenticatePass();
    }
}
