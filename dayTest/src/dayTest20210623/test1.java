package dayTest20210623;

/**
 * 现在有一个只包含数字的字符串，将该字符串转化成IP地址的形式，返回所有可能的情况。
 * 例如：
 * 给出的字符串为"25525522135",
 * 返回["255.255.22.135", "255.255.221.35"]. (顺序没有关系)
 *
 * 输入：
 * "25525522135"
 * 返回值：
 * ["255.255.22.135","255.255.221.35"]
 */

//深搜
import java.util.ArrayList;

public class test1 {
    public ArrayList<String> restoreIpAddresses(String s) {
        ArrayList<String> res = new ArrayList<>();
        ArrayList<String> ip = new ArrayList<>();  //存放中间结果
        dfs(s, res, ip, 0);
        return res;
    }

    private void dfs(String s, ArrayList<String> res, ArrayList<String> ip, int start){
        if(ip.size() == 4 && start == s.length()){  //找到一个合法解
            res.add(ip.get(0) + '.' + ip.get(1) + '.' + ip.get(2) + '.' + ip.get(3));
            return;
        }
        if(s.length() - start > 3 * (4 - ip.size()))  //剪枝
            return;
        if(s.length() - start < (4 - ip.size()))  //剪枝
            return;
        int num = 0;
        for(int i = start; i < start + 3 && i < s.length(); i++){
            num = num * 10 + (s.charAt(i) - '0');
            if(num < 0 || num > 255)  //剪枝
                continue;
            ip.add(s.substring(start, i + 1));
            dfs(s, res, ip, i + 1);
            ip.remove(ip.size() - 1);

            if(num == 0)  //不允许前缀0
                break;
        }
    }
}
