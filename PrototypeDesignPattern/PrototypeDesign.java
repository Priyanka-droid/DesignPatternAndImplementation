package PrototypeDesignPattern;

public class PrototypeDesign {
    public static void main(String[] args) {
        GhostFreak g = new GhostFreak();
        g.isAlien = true;
        g.name = "G";
        g.volume = 10.10;
        GhostFreak g2 = (GhostFreak)g.clone();
        System.out.println(g.isAlien + " " + g.name + " " + g.volume);
        System.out.println(g2.isAlien + " " + g2.name + " " + g.volume);

        Fourarms f = new Fourarms();
        f.isAlien = true;
        f.name = "F";
        f.volume = 1.1;
        Fourarms f2 =(Fourarms)f.clone();
        System.out.println(f.isAlien + " " + f.name + " " + f.volume);
        System.out.println(f2.isAlien + " " + f2.name + " " + f2.volume);

    }
}

abstract class BenAlienForce {
    boolean isAlien;
    String name;

    BenAlienForce() {
    }

    BenAlienForce(BenAlienForce b) {
        this.isAlien = b.isAlien;
        this.name = b.name;
    }

    public abstract BenAlienForce clone();
}

class GhostFreak extends BenAlienForce {
    Double volume;

    GhostFreak() {
    }

    public GhostFreak(GhostFreak g) {
        super(g);
        this.volume = g.volume;
    }

    @Override
    // return type icould be subclass type?
    public BenAlienForce clone() {
        return new GhostFreak(this);
    }
}

class Fourarms extends BenAlienForce {
    Double volume;

    Fourarms() {
    }

    public Fourarms(Fourarms g) {
        super(g);
        this.volume = g.volume;
    }

    @Override
    // return type could be subclass type?
    public BenAlienForce clone() {
        return new Fourarms(this);
    }
}
