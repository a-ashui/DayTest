package dayTest20210517;

/**
 *小喵们很喜欢把自己装进容器里的（例如碗），但是要是碗的周长比喵的身长还短，它们就进不去了。
 * 现在告诉你它们的身长，和碗的半径，请判断一下能否到碗里去。
 */
import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Double n = sc.nextDouble();
            Double r = sc.nextDouble();
            if(n < 2 * 3.14 * r) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
