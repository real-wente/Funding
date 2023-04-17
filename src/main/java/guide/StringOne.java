package guide;

/**
 * @author wentao
 * @date 2023/4/17 15:17
 */

public class StringOne {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(10);
        builder.append("one");
        System.out.println(builder);
        builder.append("two");
        System.out.println(builder);
        builder.insert(4,"four");
        System.out.println(builder);
        builder.delete(4,5);
        System.out.println(builder);
    }
}
