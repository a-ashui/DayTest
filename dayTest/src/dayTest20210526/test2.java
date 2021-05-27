package dayTest20210526;

/**
 * 有一家早餐店，这家店的客人都有个奇怪的癖好：他们只要来这家店吃过一次早餐，就会每天都过来；并且，所有人在这家店吃了两天早餐后，
 * 接下来每天都会带一位新朋友一起来品尝。
 * 于是，这家店的客人从最初一个人发展成浩浩荡荡成百上千人：1、1、2、3、5……
 * 现在，想请你帮忙统计一下，某一段时间范围那他总共卖出多少份早餐（假设每位客人只吃一份早餐）。
 */
import java.util.*;
import java.math.*;

public class test2{
    public static void main(String[] args){
        BigInteger[] people=new BigInteger[85];
        people[0]=new BigInteger("1");
        people[1]=new BigInteger("1");
        for(int i=2;i<85;i++){
            people[i]=people[i-1].add(people[i-2]);
        }
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int from=sc.nextInt();
            int to=sc.nextInt();
            BigInteger result=new BigInteger("0");
            for(int i=from-1;i<to;i++){
                result=result.add(people[i]);
            }
            System.out.println(result);
        }
    }
}
