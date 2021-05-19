package dayTest20210518;

/**
 * 给定三条边，请你判断一下能不能组成一个三角形。
 *
 * 输入包含多组数据，每组数据包含三个正整数a、b、c（1≤a, b, c≤10^100）。
 *
 * 对应每一组数据，如果它们能组成一个三角形，则输出“Yes”；否则，输出“No”。
 *
 */
import java.util.Scanner;
import java.math.BigInteger;

public class test2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            BigInteger a=sc.nextBigInteger();
            BigInteger b=sc.nextBigInteger();
            BigInteger c=sc.nextBigInteger();
            if(a.add(b).compareTo(c)>0 && a.add(c).compareTo(b)>0 && b.add(c).compareTo(a)>0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
