package dayTest20210611;

/**
 * 一个整型数组里除了两个数字只出现一次，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 *
 * 输入：
 * [1,4,1,6]
 * 返回值：
 * [4,6]
 * 说明：
 * 返回的结果中较小的数排在前面
 */

public class test1 {
    public int[] FindNumsAppearOnce (int[] array) {
        //新建变量k，用于全员异或
        int k = 0;
        for(int num : array){
            k ^= num;
        }
        //找到最低位为1的变量flag
        int flag = 1;
        while((flag & k) == 0){
            flag <<= 1;
        }
        //数组分组后，遍历输出两个出现一次的数字
        int a = 0;
        int b = 0;
        for(int num : array){
            if((num & flag) == 0){
                a ^= num;
            }else{
                b ^= num;
            }
        }
        //较小的数排在前面
        if(a > b){
            int temp = b;
            b = a;
            a = temp;
        }
        return new int[]{a, b};
    }
}
