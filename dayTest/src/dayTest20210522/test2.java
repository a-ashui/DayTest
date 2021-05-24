package dayTest20210522;
/**
 * 所谓因子分解，就是把给定的正整数a，分解成若干个素数的乘积，即 a = a1 × a2 × a3 × ... × an,
 * 并且 1 < a1 ≤ a2 ≤ a3 ≤ ... ≤ an。其中a1、a2、...、an均为素数。 先给出一个整数a，请输出分解后的因子。
 *
 */

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int count = 0;
            result.append(num + " " + "=");
            int j = num;
            for (int i = 2;i<=Math.sqrt(j);i++) {
                while (num % i == 0) {
                    result.append(" "+i+" "+"*");
                    num = num/i;
                    count++;
                }
                if (num == 1) break;
            }
            if (num != 1) result.append(" "+ num);
            if (result.charAt(result.length()-1) == '*') {
                result.deleteCharAt(result.length()-1);
                result.deleteCharAt(result.length()-1);
            }
            System.out.println(result);
            result.setLength(0);
        }
    }
}


