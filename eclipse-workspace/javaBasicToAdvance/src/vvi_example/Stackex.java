package vvi_example;
import java.util.Stack;

public class Stackex {
    public static void main(String[] args) {
       Stack<Integer> st=new Stack<>();
       st.add(5);
       System.out.println(st.peek());
       Stack st2=new Stack();
       st2.add(3);
       
       st2.add("java");
       System.out.println(st2.elementAt(0));
       System.out.println(st2);
       
    }
}