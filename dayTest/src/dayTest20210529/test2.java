package dayTest20210529;

/**
 * Web系统通常会频繁地访问数据库，如果每次访问都创建新连接，性能会很差。为了提高性能，
 * 架构师决定复用已经创建的连接。当收到请求，并且连接池中没有剩余可用的连接时，系统会创建一个新连接，
 * 当请求处理完成时该连接会被放入连接池中，供后续请求使用。
 * 现在提供你处理请求的日志，请你分析一下连接池最多需要创建多少个连接。
 *
 *
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt(),rs=0;
            Queue<String> qe=new LinkedList<String>();
            for (int i = 0; i < n; i++) {
                String id=in.next();
                String status=in.next();
                qe.add(status);
            }

            int flag=0;
            for (int i = 0; i < n; i++) {
                if(qe.poll().equals("connect")){
                    if(flag==0){
                        rs++;
                    }
                    flag++;
                }
                else{
                    flag--;
                }
            }
            System.out.println(rs);
        }
    }
}

