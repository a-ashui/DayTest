package dayTest20210512;

/**
 * 洗牌在生活中十分常见，现在需要写一个程序模拟洗牌的过程。 现在需要洗2n张牌，
 * 从上到下依次是第1张，第2张，第3张一直到第2n张。首先，我们把这2n张牌分成两堆，
 * 左手拿着第1张到第n张（上半堆），右手拿着第n+1张到第2n张（下半堆）。接着就开始洗牌的过程，
 * 先放下右手的最后一张牌，再放下左手的最后一张牌，接着放下右手的倒数第二张牌，
 * 再放下左手的倒数第二张牌，直到最后放下左手的第一张牌。接着把牌合并起来就可以了。
 * 例如有6张牌，最开始牌的序列是1,2,3,4,5,6。首先分成两组，左手拿着1,2,3；右手拿着4,5,6。
 * 在洗牌过程中按顺序放下了6,3,5,2,4,1。把这六张牌再次合成一组牌之后，我们按照从上往下的顺序看这组牌，
 * 就变成了序列1,4,2,5,3,6。 现在给出一个原始牌组，请输出这副牌洗牌k次之后从上往下的序列。
 *
 *  思路： 第一步：首先创建一个数组，来存放洗牌后的结果；
 * 第二步：将 2n 个牌分成两半，上半和下半，然后从下半堆中取最后一个数放入新数组最后一个位置上，再往前一个位置放入上半堆的最后一个数，重复上述操作，直到数组满，即牌全部放入数组中，到此第一次洗牌结束；
 * 第三步：K 是洗牌的次数，只要重复上述步骤二 K 次就可以了
 */

import java.util.*;

public class test1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int K = sc.nextInt();
            int[] array = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                array[i] = sc.nextInt();
            }
            // 洗牌
            int[] ret = shuffleCards(K, array);
            for (int i = 0; i < ret.length; i++) {
                System.out.print(ret[i]);
                if (i != ret.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            T--;
        }
    }

    // 洗牌过程
    private static int[] shuffleCards(int K, int[] array) {
        int[] ret = new int[array.length];
        while (K > 0) {
            int mid = array.length / 2; // 下一半牌第一张牌的下标
            int cur1 = mid - 1;
            int cur2 = array.length - 1;
            for (int i = array.length - 1; i > 0; i -= 2) {
                ret[i] = array[cur2];
                ret[i - 1] = array[cur1];
                cur1--;
                cur2--;
            }
            for (int i = 0; i < ret.length; i++) {
                array[i] = ret[i];
            }
            K--;
        }
        return ret;
    }
}
