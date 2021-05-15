package dayTest20210514;

import java.util.Scanner;

/**
 * Levenshtein 距离，又称编辑距离，指的是两个字符串之间，由一个转换成另一个所需的最少编辑操作次数。
 * 许可的编辑操作包括将一个字符替换成另一个字符，插入一个字符，删除一个字符。编辑距离的算法是首先由俄国科学家Levenshtein提出的，
 * 故又叫Levenshtein Distance。
 *
 * Ex：
 *
 * 字符串A:abcdefg
 *
 * 字符串B: abcdef
 *
 * 通过增加或是删掉字符”g”的方式达到目的。这两种方案都需要一次操作。把这个操作所需要的次数定义为两个字符串的距离。
 *
 * 要求：
 *
 * 给定任意两个字符串，写出一个算法计算它们的编辑距离。
 */
public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String strA = in.next();
            String strB = in.next();
            int ic = 1;
            int dc = 1;
            int rc = 1;
            int cost = strEditCost(strA, strB, ic, dc, rc);
            System.out.println(cost);
        }
    }
    public static int strEditCost(String strA, String strB, int ic, int dc, int rc){
        int m = strA.length();
        int n = strB.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= n; i++) dp[0][i] = i*ic;
        for (int i = 1; i <= m; i++) dp[i][0] = i*dc;
        for (int x = 1; x <= m; x++) {
            for (int y = 1; y <= n; y++) {
                int cost1 = dp[x-1][y] + dc;
                int cost2 = dp[x][y-1] + ic;
                int cost3 = 0;
                if(strA.charAt(x-1) == strB.charAt(y-1))
                    cost3 = dp[x-1][y-1];
                else
                    cost3 = dp[x-1][y-1] + rc;
                dp[x][y] = Math.min(cost1, cost2);
                dp[x][y] = Math.min(dp[x][y], cost3);
            }
        }
        return dp[m][n];
    }
}
