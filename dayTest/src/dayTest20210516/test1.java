package dayTest20210516;

/**
 *星际战争开展了100年之后，NowCoder终于破译了外星人的密码！他们的密码是一串整数，通过一张表里的信息映射成最终4位密码。表的规则是：n对应的值是矩阵X的n次方的左上角，
 * 如果这个数不足4位则用0填充，如果大于4位的则只输出最后4位。
 * |1 1|^n => |Xn ..|
 * |1 0|      |.. ..|
 * 例如n=2时，
 * |1 1|^2 => |1 1| * |1 1| => |2 1|
 * |1 0|      |1 0|   |1 0|    |1 1|
 * 即2对应的数是“0002”。
 */

import java.text.DecimalFormat;
import java.util.Scanner;
public class test1{

    public static int[] resArr = new int[10001];
    static{
        resArr[0] = 1;
        resArr[1] = 1;
        for (int i = 2; i < 10001; i++) {
            resArr[i] = (resArr[i-1] + resArr[i-2]) % 10000;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0000");
        while(scan.hasNext()){
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                int numF = resArr[num];
                System.out.print(df.format(numF));
            }
            System.out.println();
        }
    }
}