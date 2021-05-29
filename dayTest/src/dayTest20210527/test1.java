package dayTest20210527;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 许多客户写电子邮件。正如你所知，如果一封邮件中包含多个收件人，收件人姓名之间会用一个逗号和空格隔开；如果收件人姓名也包含空格或逗号，则姓名需要用双引号包含。
 * 现在给你一组收件人姓名，请你帮他生成相应的收件人列表。
 */
public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            in.nextLine();
            ArrayList<String> arrayList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String name = in.nextLine();
                if(name.contains(" ") || name.contains(",")){
                    arrayList.add("\"" + name + "\"");
                }else {
                    arrayList.add(name);
                }
            }
            for (int i = 0; i < n-1; i++) {
                System.out.println(arrayList.get(i)+",");
            }
            System.out.println(arrayList.get(n-1));
        }
    }
}
