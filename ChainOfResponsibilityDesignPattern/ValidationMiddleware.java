package ChainOfResponsibilityDesignPattern;

public class ValidationMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {
        if (!(email.length() < 10))
            return false;
        if (!(password.length() < 10))
            return false;
        return checkNext(email, password);
    }

}
