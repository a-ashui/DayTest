package dayTest20210520;

/**
 * 居然有假币！ 现在猪肉涨了，但是农民的工资却不见涨啊，没钱怎么买猪肉啊。
 * 这就去买猪肉，结果找来的零钱中有假币！！！可惜一不小心把它混进了一堆真币里面去了。
 * 只知道假币的重量比真币的质量要轻，给你一个天平（天平两端能容纳无限个硬币），
 * 请用最快的时间把那个可恶的假币找出来。
 */
import java.io.PrintStream;
import java.util.Scanner;

public class test2 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static int findCoin(int n){
        if(n==1)
            return 0;
        if(n<=3)
            return 1;
        int metage,rest,times=0;
        // 3等分前，先加2，使得metage的值尽量大于rest
        // (metage,metage,rest)
        metage = (n+2)/3;
        rest = n-2*metage;

        times= 1 + findCoin(Math.max(metage, rest));
        return times;
    }
    public static void main(String[] args) {
        int n;
        while((n=in.nextInt()) > 0){
            out.println(findCoin(n));
        }
    }
}

