package ChainOfResponsibilityDesignPattern;

public abstract class Middleware {
    private Middleware next;

    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware middleware : chain) {
            head.next = middleware;
            head = head.next;
        }
        return first;
    }

    public abstract boolean check(String email, String password);

    public boolean checkNext(String email, String password) {
        if (next == null)
            return true;
        else
            return next.check(email, password);
    }

}
