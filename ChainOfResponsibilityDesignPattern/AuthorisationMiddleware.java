package ChainOfResponsibilityDesignPattern;

public class AuthorisationMiddleware extends Middleware {

    private Server server;

    public AuthorisationMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email))
            return false;
        if (!server.validPassword(email, password))
            return false;

        return checkNext(email, password);

    }

}
