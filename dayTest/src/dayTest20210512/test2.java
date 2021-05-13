package dayTest20210512;

import java.util.Scanner;

/**
 *
 MP3 Player因为屏幕较小，显示歌曲列表的时候每屏只能显示几首歌曲，用户要通过上下键才能浏览所有的歌曲。
 为了简化处理，假设每屏只能显示4首歌曲，光标初始的位置为第1首歌。

 现在要实现通过上下键控制光标移动来浏览歌曲列表，控制逻辑如下：
 歌曲总数<=4的时候，不需要翻页，只是挪动光标位置。
 光标在第一首歌曲上时，按Up键光标挪到最后一首歌曲；光标在最后一首歌曲时，按Down键光标挪到第一首歌曲。
 ->  1               1
 2   ---UP-->    2
 3               3
 4           ->  4
 其他情况下用户按Up键，光标挪到上一首歌曲；用户按Down键，光标挪到下一首歌曲。
 1               1
 2   ---UP-->->  2
 ->  3               3
 4               4

 2. 歌曲总数大于4的时候（以一共有10首歌为例）：

 特殊翻页：屏幕显示的是第一页（即显示第1 – 4首）时，光标在第一首歌曲上，用户按Up键后，屏幕要显示最后
 一页（即显示第7-10首歌），同时光标放到最后一首歌上。同样的，屏幕显示最后一页时，光标在最后一首歌曲上，
 用户按Down键，屏幕要显示第一页，光标挪到第一首歌上。
 ->  1               7
 2   ---UP-->    8
 3               9
 4           ->  10
 一般翻页：屏幕显示的不是第一页时，光标在当前屏幕显示的第一首歌曲时，用户按Up键后，屏幕从当前歌曲的上
 一首开始显示，光标也挪到上一首歌曲。光标当前屏幕的最后一首歌时的Down键处理也类似。
 ->  4           ->  3
 5   ---UP-->    4
 6               5
 7               6
 其他情况，不用翻页，只是挪动光标就行。
 */
public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Scanner scanner = new Scanner(Main.class.getClassLoader().getResourceAsStream("data.txt"));
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            String command = scanner.next();
//            System.out.println(num + " " + command);
            System.out.println(locatePointer(num, command));
        }
        scanner.close();
    }

    private static String locatePointer(int num, String command) {

        if (num < 5) {
            return lessThan5(num, command);
        } else {
            return greatThan4(num, command);
        }


    }

    /**
     * 求光标的位置，歌曲数大于4
     *
     * @param num     总共的歌曲数目
     * @param command 命令
     * @return 当前选中歌曲
     */
    private static String greatThan4(int num, String command) {
        int curr = 1;
        // 屏幕可以显示的第一个光标
        int top = 1;
        // 屏幕可以显示的最后一个光标
        int bot = 4;


        StringBuilder builder = new StringBuilder(command.length() * 2);

        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);

            // 如果是向上的
            if (c == 'U') {
                curr--;

                // 如果翻到第一首歌的上面
                if (curr < 1) {
                    curr = num;
                    // 更新窗口可以显示的范围
                    bot = num;
                    top = num - 3;
                }
                // 非第一首歌上面
                else {
                    // 已经超过显示的范围
                    if (curr < top) {
                        top = curr;
                        bot = curr + 3;
                    }
                }
            } else if (c == 'D') {
                curr++;

                // 如果翻到最后一首歌的下面了
                if (curr > num) {
                    curr = 1;

                    // 更新窗口可以显示的范围
                    bot = 4;
                    top = 1;
                }
                // 不是最后一首歌
                else {
                    // 已经超过显示的范围
                    if (curr > bot) {
                        bot = curr;
                        top = curr - 3;
                    }
                }
            }

            // 如果是最后一个命令，记录页面显示的范围和光标的位置
            if (i == command.length() - 1) {
                for (int j = top; j <= bot; j++) {
                    // 计录光标的范围
                    builder.append(j).append(' ');
                }
                builder.setCharAt(builder.length() - 1, '\n');
                // 计录光标的位置
                builder.append(curr).append('\n');
            }
        }


        return builder.substring(0, builder.length() - 1);
    }

    /**
     * 求光标的位置，歌曲数小于5
     *
     * @param num     总共的歌曲数目
     * @param command 命令
     * @return 当前选中歌曲
     */
    private static String lessThan5(int num, String command) {

        StringBuilder builder = new StringBuilder(command.length() * 2);

        // 当前光标的位置，以0计
        int curr = 0;
        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            if (c == 'U') {
                curr = (curr - 1 + num) % num;

            } else if (c == 'D') {
                curr = (curr + 1 + num) % num;
            }

            // 如果是最后一个命令，记录页面显示的范围和光标的位置
            if (i == command.length() - 1) {
                for (int j = 1; j <= num; j++) {
                    // 计录光标的范围
                    builder.append(j).append(' ');
                }
                builder.setCharAt(builder.length() - 1, '\n');
                // 计录光标的位置
                builder.append(curr + 1).append('\n');
            }


        }

        return builder.substring(0, builder.length() - 1);
    }
}
