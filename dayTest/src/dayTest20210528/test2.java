package dayTest20210528;

import java.util.*;

/**
 * 每天要处理许多邮件，但他并不是在收件人列表中，有时候只是被抄送。他认为这些抄送的邮件重要性比自己在收件人列表里的邮件低，因此他要过滤掉这些次要的邮件，优先处理重要的邮件。
 * 现在给你一串抄送列表，请你判断目标用户是否在抄送列表中。
 */

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String name = sc.nextLine();
            char[] ch = s.toCharArray();
            List<String> list = new ArrayList<>();
            int flag = 0;
            String res = "";
            for (int i = 0; i < ch.length; i ++ ) {
                if(flag == 0 && ch[i] == '"') {
                    flag = 1;
                    list.add(res);
                    res = "";
                } else if(flag == 1 && ch[i] == '"') {
                    flag = 0;
                    list.add(res);
                    res = "";
                } else if(flag == 1) {
                    res += ch[i];
                } else if(flag == 0 && ch[i] != ',') {
                    res += ch[i];
                }
            }
            list.add(res);
            boolean isFinded = false;
            for (String string:list) {
                if(name.equals(string)) {
                    isFinded = true;
                    break;
                }
            }
            if(isFinded) System.out.println("Ignore");
            else System.out.println("Important!");
        }
    }
}
