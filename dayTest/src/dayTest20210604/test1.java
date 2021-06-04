package dayTest20210604;

/**
 * 求字典序在s1和s2之间的，长度在len1到len2的字符串的个数，结果mod 1000007。
 */
public class test1 {
    private static int process(String str1, String str2, int len1, int len2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        long res = 0;
        for (int i = len1; i <= len2; i++) {
            char a = ch1[0];
            char b = ch2[0];
            res += (long) Math.pow(26, i - 1) * (b - a);
            long suma = 0;
            long sumb = 0;
            for (int j = 1; j < ch1.length; j++)// 找到比ch1剩余字符串小的字符串个数
            {
                suma = suma + (ch1[j] - 'a') * (long) Math.pow(26, i - 1 - j);
            }
            for (int j = 1; j < ch2.length; j++)// 找到比ch2剩余字符串小的字符串个数
            {
                sumb = sumb + (ch2[j] - 'a') * (long) Math.pow(26, i - 1 - j);
            }
            res = res + sumb - suma;
        }
        res--;
        res= res % 1000007;
        return (int) res;
    }
}
