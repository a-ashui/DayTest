package dayTest20210623;

/**
 * 给定一个非负整数 NN，返回 N!N! 结果的末尾为 00 的数量。
 * N!N! 是指自然数 NN 的阶乘,即:N!=1*2*3…(N-2)*(N-1)*NN!=1∗2∗3…(N−2)∗(N−1)∗N。
 *
 * 示例1
 * 输入：
 * 3
 * 返回值：
 * 0
 * 说明：
 * 3!=6
 */

public class test2 {
    /**
     * the number of 0
     * @param n long长整型 the number
     * @return long长整型
     */
    public long thenumberof0 (long n) {
        // write code here
        // if(n==0)return 1;
        long count=0;
        while(n!=0){
            count+=n/5;
            n=n/5;
        }
        return count;
    }
}
