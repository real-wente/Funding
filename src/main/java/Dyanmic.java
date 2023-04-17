/**
 * @author wentao
 * @date 2023/3/29 15:08
 */

public class Dyanmic {

    public static int Fibonacci(int n){
        if (n <= 0 ) {
            return 0;
        }
        int[] Memo = new int[n + 1];
        for (int i = 0;i <= n;i++){
            Memo[i] = -1;
        }
        return fib(n,Memo);
    }

    public static int fib(int n,int []Memo){
        if (Memo[n] != -1){
            return Memo[n];
        }
        if (n <= 2){
            Memo[n] = 1;
        }else {
            Memo[n] = fib(n -1,Memo) + fib(n - 2,Memo);
        }
        return Memo[n];
    }

    /**
     * 动态规划入门版
     * @param n 数列
     * @return 总和
     */
    public static int fib1(int n){
        if (n <= 0){
            return n;
        }
        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;
        for (int i =2;i <= n;i++){
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }

    /**
    进一步压缩空间
     */
    public static int fib2(int n){
        if (n <= 1){
            return n;
        }
        int Memo_i_2 = 0;
        int Memo_i_1 = 1;
        int Memo_i = 1;
        for (int i = 2;i <= n;i++){
            Memo_i = Memo_i_2 + Memo_i_1;
            Memo_i_2 = Memo_i_1;
            Memo_i_1 = Memo_i;
        }
        return Memo_i;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(4));
        System.out.println(fib1(4));


    }
    
}
