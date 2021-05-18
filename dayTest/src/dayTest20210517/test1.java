package dayTest20210517;

/**
 *一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class test1{
    public int jumpFloor(int target) {
        if(target<=0){
            return 0;
        }
        int fn1=1,fn2=2,sum=0;
        if(target<=2){
            if(target==1){
                return fn1;
            }else{
                return fn2;
            }
        }
        while(target>2){
            sum =fn1+fn2;
            fn1=fn2;
            fn2=sum;
            target--;
        }
        return sum;
    }
}
