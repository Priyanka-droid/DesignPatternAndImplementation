package ChainOfResponsibilityDesignPattern;

public class Client {
    public static void main(String[] args) {

        Server s = new Server();
        s.addCredential("email1", "pass1");
        s.addCredential("email2", "pass2");
        s.setMiddleware(Middleware.link(new AuthorisationMiddleware(s), new ValidationMiddleware()));
        s.login("email1", "pass1");

    }
}
