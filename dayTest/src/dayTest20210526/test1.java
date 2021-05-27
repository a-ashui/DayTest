package dayTest20210526;

/**
 * 一块花布条，里面有些图案，另有一块直接可用的小饰条，里面也有一些图案。对于给定的花布条和小饰条，计算一下能从花布条中尽可能剪出几块小饰条来呢？
 *
 *
 */
import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.next();
            String b = in.next();
            int count = 0;
            while(a.contains(b)){
                a = a.replaceFirst(b,"");
                count++;
            }
            System.out.println(count);
        }
    }
}
