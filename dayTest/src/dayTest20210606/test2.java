package dayTest20210606;

/**
 * nowcoder要和朋友交流一些敏感的信息，例如他的电话号码等。因此他要对这些敏感信息进行混淆，比如在数字中间掺入一些额外的符号，让它看起来像一堆乱码。
 * 现在请你帮忙开发一款程序，解析从nowcoder那儿接收到的信息，读取出中间有用的信息。
 *
 * 输入
 * $Ts!47&*s456  a23* +B9k
 * 输出
 * 47456239
 */

import java.io.*;

public class test2{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        while((str=br.readLine())!=null){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='0' && str.charAt(i)<='9')
                    System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }
}


