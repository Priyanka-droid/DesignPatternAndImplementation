package IteratorDesignPattern;

public interface ProfileIterator {
    public boolean hasNext();
    public Profile getNext();
    public void reset();
}
