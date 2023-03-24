/**
 * @author wentao
 * @date 2023/3/24 14:58
 */

public class Lambda {

    //final static int num = 1;

    public static void main(String[] args) {
        Lambda tester = new Lambda();
        //MathOperation add = Integer::sum;
//        MathOperation add = (int a, int b) -> a + b;
//        MathOperation sub = (int a, int b) -> a - b;
//        MathOperation mul = (int a, int b) -> { return a * b;};
//        MathOperation div = (int a, int b) -> a / b;
//        System.out.println(tester.operate(10, 5, add));
//        System.out.println(tester.operate(10, 5, sub));
//        System.out.println(tester.operate(10, 5, mul));
//        System.out.println(tester.operate(10, 5, div));

//        GreetingServiec greetingServiec1;
//        greetingServiec1 = message -> System.out.println("Hello " + message);
//
//        GreetingServiec greetingServiec2;
//        greetingServiec2 = message -> System.out.println("Hello " + message);
//
//        greetingServiec1.sayMessage("Runoob");
//        greetingServiec2.sayMessage("Google");


        final int num = 1;
        /*
          lambda 表达式中使用的变量应为 final 或有效 final
         */
        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
        s.convert(2);
    }

    public interface Converter<T1, T2>{
        void convert(int i);
    }

    interface MathOperation{
        /**
         * 实参传入
         */
        int operation(int a, int b);
    }

    interface GreetingServiec{
        /**
         * 获取
         * @param message
         */
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }

}
