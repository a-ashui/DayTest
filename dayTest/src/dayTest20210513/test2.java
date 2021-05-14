package dayTest20210513;

import java.util.Scanner;

/**
 * 小易经常沉迷于网络游戏.有一次,他在玩一个打怪升级的游戏,他的角色的初始能力值为 a.
 * 在接下来的一段时间内,他将会依次遇见n个怪物,每个怪物的防御力为b1,b2,b3...bn.
 * 如果遇到的怪物防御力bi小于等于小易的当前能力值c,那么他就能轻松打败怪物,
 * 并且使得自己的能力值增加bi;如果bi大于c,那他也能打败怪物,
 * 但他的能力值只能增加bi与c的最大公约数.那么问题来了,在一系列的锻炼后,小易的最终能力值为多少?
 */
public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();//怪兽数量
            int c = in.nextInt();//能力值
            int[] monster = new int[n];
            for (int i = 0; i <n ; i++) {
                monster[i] = in.nextInt();
                if(c >= monster[i]){
                    c += monster[i];
                }else {
                    c += gys(c,monster[i]);
                }
            }
            System.out.println(" "+ c);
        }
    }

    private static int gys(int c, int i) {
        if(i % c == 0){
            return c;
        }else {
            gys(i & c,c);
        }
        return i%c;
    }
}
