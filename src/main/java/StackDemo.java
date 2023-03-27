import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author wentao
 * @date 2023/3/27 14:58
 */

public class StackDemo {
    public static void showpush(Stack<Integer> st, int a){
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println(("stack: " + st));
    }

    public static void showpop(Stack<Integer> st){
        System.out.println("pop ->");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println("stack: " + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);
        try {
            showpop(st);
        } catch (EmptyStackException e){
            System.out.println("empty stack");
        }


    }
}
