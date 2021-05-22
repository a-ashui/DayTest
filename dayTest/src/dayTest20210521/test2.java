package dayTest20210521;

/**
 * 一个正整数可以分解成一个或多个数组的积。例如36=2*2*3*3，即包含2和3两个因子。
 * 研究因子个数的分布规律，现在给出一系列正整数，希望你开发一个程序输出每个正整数的因子个数。
 */
import java.util.*;
public class test2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            if (isPrimer(n)) {
                System.out.println(1);
                continue;
            }
            int cnt = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    while (n % i == 0) {
                        n /= i;
                    }
                    cnt++;
                }
            }
            if (n != 1) cnt++;
            System.out.println(cnt);
        }
    }

    public static boolean isPrimer(int n) {
        for (int i = 2; i <= Math.pow(n, 0.5); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
