package dayTest20210513;

/**
 * 找出字符串中第一个只出现一次的字符
 */
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            char[] cs = str.toCharArray();
            for(int i = 0; i < cs.length; i++){
                if(str.indexOf(cs[i]) == str.lastIndexOf(cs[i])){
                    System.out.println(cs[i]);
                    break;
                }
            }
        }
    }
}
