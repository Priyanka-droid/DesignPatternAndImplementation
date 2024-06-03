package ChainOfResponsibilityDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class Server {

    private Middleware middleware;
    private Map<String, String> emailPassMap = new HashMap<String, String>();

    public void setMiddleware(Middleware m) {
        this.middleware = m;
    }

    public void addCredential(String email, String password) {
        emailPassMap.put(email, password);
    }

    public boolean hasEmail(String email) {
        return emailPassMap.containsKey(email);
    }

    public boolean validPassword(String email, String password) {
        return emailPassMap.get(email) == password;

    }

    public void  login(String email, String password) {
        if (middleware.check(email, password))
            System.out.println("access granted");
        else
            System.out.print("access denied");
            ;
    }
}