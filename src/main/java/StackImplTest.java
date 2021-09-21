package main.java;

public class StackImplTest {
    public static void main(String[] args) {
        //test

        try {
            Stack<Integer> s = new StackImpl<Integer>(5);
            s.push(4);
            s.push(3);
            s.push(3);
            System.out.println("Size: "+s.size());

            Integer i = s.pop();
            System.out.println("Popped: " + i);
            System.out.println("Final size: " + s.size());


            Stack<Integer> s1 = new StackImpl<Integer>(2);
            s1.pop();
        }
        catch (FullStackException | EmptyStackException e){
            e.printStackTrace();
        }
        try {

            Stack<Integer> s2 = new StackImpl<Integer>(2);
            s2.push(4);
            s2.push(3);
            s2.push(3);
            System.out.println(s2.size());
        }
        catch (FullStackException e){
            e.printStackTrace();
        }
    }
}
