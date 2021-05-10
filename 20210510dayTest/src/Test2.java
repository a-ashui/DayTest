
import java.util.Scanner;
/**
 * 查找两个字符串a,b中的最长公共子串。若有多个，输出在较短串中最先出现的那个。
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String s1=in.nextLine();
            String s2=in.nextLine();
            System.out.println(lonComSub(s1,s2));
        }
        in.close();
    }

    private static String lonComSub(String a, String b) {
        int aLen=a.length()+1;
        int bLen=b.length()+1;//子所以要限制长度+1，方便c[0][0]
        int end=0;
        int max=0;
        if(aLen>bLen){//将较短的字符串放在前面
            int temp;
            temp=aLen;
            aLen=bLen;
            bLen=temp;

            String s;
            s=a;
            a=b;
            b=s;
        }
        //事实上真正计数的从c[1][1]开始
        int[][] c=new int[aLen][bLen];

        for (int i = 1; i < aLen; i++) {
            for (int j = 1; j < bLen; j++) {
                if(a.charAt(i-1)==b.charAt(j-1)){
                    c[i][j] = c[i-1][j-1]+1;
                }else{
                    c[i][j]=0;
                }
                if(c[i][j]>max){
                    end=i;
                    max=c[i][j];
                }
            }
        }
        return a.substring(end-max,end);
    }
}

