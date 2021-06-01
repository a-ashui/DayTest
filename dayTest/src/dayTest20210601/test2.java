package dayTest20210601;

import java.util.Scanner;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 */
public class test2 {
    public static int Fibonacci(int n) {
        int first = 0;
        int second = 1;
        int result = 0;
        if(n == 0)return 0;
        if(n == 1)return 1;
        for (int i = 2; i <= n; i++) {
            result = first + second;
            first = second ;
            second = result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(Fibonacci(n));
    }
}
