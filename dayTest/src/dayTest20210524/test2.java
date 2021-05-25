package dayTest20210524;

/**
 *小明号称自己已经记住了1-100000之间所有的斐波那契数。
 * 为了考验他，我们随便出一个数n，让他说出第n个斐波那契数。当然，斐波那契数会很大。因此，如果第n个斐波那契数不到6位，则说出该数；否则只说出最后6位。
 */
import java.util.Scanner;
public class test2{
    static int[] fib = new int[100001];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        fib[0] = 1;
        fib[1] = 1;
        while (in.hasNext()) {
            int n = in.nextInt();
            System.out.printf((n<25?"%d\n":"%06d\n"), getFibonacci(n));
        }
        in.close();
    }
    static int getFibonacci(int n) {
        if (fib[2] == 0) {
            for (int i = 2; i <100001; i++) {
                fib[i] = (fib[i-1] + fib[i-2]) % 1000000;
            }
        }
        return fib[n];
    }
}
