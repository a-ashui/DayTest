package dayTest20210511;

import java.util.Scanner;

/**
 * 给定两个只包含小写字母的字符串，计算两个字符串的最大公共子串的长度。
 */
public class test1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            String max=s1.length()>=s2.length()?s1:s2;
            String min=s1.length()>=s2.length()?s2:s1;
            int l=0;
            String s="";
            for (int i = 0; i < min.length(); i++) {
                for (int j = i+1; j <= min.length(); j++) {
                    if (max.contains(min.substring(i,j)) && j-i>l) {
                        l=j-i;
                        s=min.substring(i,j);
                    }
                }
            }
            System.out.println(s.length());
        }
    }
}
