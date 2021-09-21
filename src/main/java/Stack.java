package main.java;


public interface Stack<E>{
    public void push(E v) throws FullStackException;
    public E pop() throws EmptyStackException;
    public int size();
}
