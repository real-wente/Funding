import java.util.LinkedList;

/**
 * @author wentao
 * @date 2023/3/27 14:45
 */

public class ListLinked {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");

        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("poll="+queue.poll());
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        //返回第一个元素
        System.out.println("element="+queue.element());

        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        //返回第一个元素
        System.out.println("peek="+queue.peek());
        for(String q : queue){
            System.out.println(q);
        }


    }
}
