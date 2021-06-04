package dayTest20210604;

/**
 * 我们有两个字符串m和n，如果它们的子串a和b内容相同，则称a和b是m和n的公共子序列。子串中的字符不一定在原字符串中连续。
 * 例如字符串“abcfbc”和“abfcab”，其中“abc”同时出现在两个字符串中，因此“abc”是它们的公共子序列。此外，“ab”、“af”等都是它们的字串。
 * 现在给你两个任意字符串（不包含空格），请帮忙计算它们的最长公共子序列的长度。
 *
 * 输入
 * abcfbc abfcab
 * programming contest
 * abcd mnp
 * 输出
 * 4
 * 2
 * 0
 */

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = sc.next();
            String str2 = sc.next();
            System.out.println(LCS(str1, str2));
        }
    }

    private static int LCS(String str1, String str2) {
        int len1 = str1.length(), len2 = str2.length();
        int[][] res = new int[len1 + 1][len2 + 1];

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                int cur = 0;
                if (str1.charAt(i) == str2.charAt(j))
                    cur++;

                res[i + 1][j + 1] = maxNum(res[i][j] + cur, res[i][j + 1], res[i + 1][j]);

            }
        }
        return res[len1][len2];
    }

    /*
     * 返回三者最大值
     */
    private static int maxNum(int i, int j, int k) {
        int max = i;
        max = j > max ? j : max;
        max = k > max ? k : max;
        return max;
    }

}

