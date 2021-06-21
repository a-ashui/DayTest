package dayTest20210621;

/**
 *实现函数 int sqrt(int x).
 * 计算并返回x的平方根（向下取整）
 */
public class test1 {
    public int sqrt(int x) {
        int i = 1;
        int res = 0;
        while (x >= 0) {
            x -= i;
            res++;
            i += 2;
        }
        return res - 1;
    }
}

