
package stackdemo;

import java.util.Stack;
import javafx.scene.Node;

public class StackDemo
{
    class Node
    {
        public int info;
        public Node next;
        public Node(int i, Node n)
        {
            info = i;
            next = n;
        }
    }

    Node top;
        public StackDemo()
        {
            top = null;
        }
        public boolean empty()
        {
            return true;
        }
        
    static void showpush(Stack st, int a) 
    {
        st.push(new Integer(a));
        System.out.println("Push(" + a + ")");
        System.out.println("Stack: " + st);
    }

    static void showpop(Stack st)
    {
        System.out.print("Pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("Stack: " + st);
    }

    public static void main(String[] args)
    {
        Stack st = new Stack();
        System.out.println("Stack: " + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);

        try
        {
            showpop(st);
        }
        catch(Exception e)
        {
            System.out.println("Empty Stack..");
        }
    }
}
