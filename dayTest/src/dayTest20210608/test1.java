package dayTest20210608;

/**
 *有一个整数数组，请你根据快速排序的思路，找出数组中第K大的数。
 * 给定一个整数数组a,同时给定它的大小n和要找的K(K在1到n之间)，请返回第K大的数，保证答案存在。
 */

public class test1 {

    public int findKth(int[] a,int n,int k){
        quick(a,0,a.length-1);
        for(int i = 0;i < a.length;i++){
            if(i == a.length - k){
                return a[i];
            }
        }
        return 0;
    }

    public void quick(int[] a, int left, int right) {
        if(left > right)return;
        int base = a[left];
        int i = left;
        int j = right;
        while(i != j){
            while(a[j] >= base && i<j){
                j--;
            }
            while(a[i] <= base && i<j){
                i++;
            }
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
        a[left] = a[i];
        a[i] = base;
        quick(a,left,i-1);
        quick(a,j+1,right);

    }
}
