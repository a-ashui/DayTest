package dayTest20210609;

/**
 * 从C/C++转到Java的程序员，一开始最不习惯的就是变量命名方式的改变。C语言风格使用下划线分隔多个单词，例如“hello_world”；而Java则采用一种叫骆驼命名法的规则：除首个单词以外，所有单词的首字母大写，例如“helloWorld”。
 * 请你帮可怜的程序员们自动转换变量名。
 *
 * 输入
 * hello_world
 * nice_to_meet_you
 * 输出
 * helloWorld
 * niceToMeetYou
 */
import java.util.*;

public class test1{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str=scanner.nextLine();
            String[] words=str.split("_");
            String result=words[0];
            for(int i=1;i<words.length;i++){
                result+=(char)(words[i].charAt(0)-'a'+'A');
                for(int j=1;j<words[i].length();j++){
                    result+=words[i].charAt(j);
                }
            }
            System.out.println(result);
        }
    }
}

