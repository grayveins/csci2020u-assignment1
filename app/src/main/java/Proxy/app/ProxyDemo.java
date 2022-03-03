package Proxy.app;

public class ProxyDemo {
    public static void main(String[] args) {
        PasswordAuthenticate passAuthenticate = new ProxyPasswordAuthenticate("csci2020uisawesome!");

        passAuthenticate.authenticatePass();
        System.out.println();

        passAuthenticate.authenticatePass();
    }
}