package dayTest20210622;

/**
 * 一座大楼有层，地面算作第0层，最高的一层为第 层。已知棋子从第0层掉落肯定不会摔碎，从第层掉落可能会摔碎，也可能不会摔碎。给定整数作为楼层数，再给定整数作为棋子数，返回如果想找到棋子不会摔碎的最高层数，即使在最差的情况下扔的最小次数。一次只能扔一个棋子。
 *
 *输入：
 * 10,1
 * 返回值：
 * 10
 * 说明：
 * 因为只有1棵棋子，所以不得不从第1层开始一直试到第10层，在最差的情况下，即第10层是不会摔坏的最高层，最少也要扔10次
 */

public class test1 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回最差情况下扔棋子的最小次数
     * @param n int整型 楼层数
     * @param k int整型 棋子数
     * @return int整型
     */
    public int solve (int n, int k) {
        // 状态转移方程:dp[i][j]=dp[i][j-1]+dp[i-1][j-1]+1
        if(k==1) return n;
        int h=(int)(Math.log(n)/Math.log(2))+1;
        if(k>h) return h;
        int[] dp=new int[k];
        int i=1;
        while(true){
            int p=0;
            for(int j=0;j<k;j++){
                int temp=dp[j];
                dp[j]+=p+1;
                p=temp;
                if(dp[j]>=n) return i;
            }
            i++;
        }
    }
}
