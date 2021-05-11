package dayTest20210511;

/**
 *接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。
 */
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str=in.nextLine();
            for(int i=str.length()-1;i>=0;i--){
                System.out.print(str.charAt(i));
            }
        }
    }
}

