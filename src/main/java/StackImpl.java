package main.java;

public class StackImpl<E> implements Stack<E> {

    private E[] arr;
    private int p;


    public StackImpl(int len) {
        this.arr = (E[])new Object[len];
        this.p = 0;
    }

    @Override
    public void push(E v) throws FullStackException {
        if(this.p == this.arr.length) throw new FullStackException();
        this.arr[p] = v;
        this.p ++;


    }
    @Override
    public E pop() throws EmptyStackException {
        if(this.p == 0) throw new EmptyStackException();
        this.p --;
        E v = this.arr[this.p];
        this.arr[this.p] = null;
        return v;
    }
    @Override
    public int size(){
        return this.p;
    }

}
