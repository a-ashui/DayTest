package dayTest20210619;

/**
 * 给一个01矩阵，1代表是陆地，0代表海洋， 如果两个1相邻，那么这两个1属于同一个岛。我们只考虑上下左右为相邻。
 * 岛屿: 相邻陆地可以组成一个岛屿（相邻:上下左右） 判断岛屿个数。
 *
 * 示例1
 * 输入：
 * [[1,1,0,0,0],[0,1,0,1,1],[0,0,0,1,1],[0,0,0,0,0],[0,0,1,1,1]]
 * 返回值：
 * 3
 */

public class test2 {
    /**
     * 判断岛屿数量
     * @param grid char字符型二维数组
     * @return int整型
     */
    int num=0;
    public int solve (char[][] grid) {
        // write code here
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    num++;
                }
            }
        }
        return num;
    }
    private void dfs(char[][] grid,int x,int y){
        if(x<0||y<0||x>grid.length-1||y>grid[0].length-1||grid[x][y]=='2'||grid[x][y]=='0') return;
        grid[x][y]='2';
        if(x>0&&grid[x-1][y]=='1')
            dfs(grid,x-1,y);
        if(x+1<grid.length&&grid[x+1][y]=='1')
            dfs(grid,x+1,y);
        if(y>0&&grid[x][y-1]=='1')
            dfs(grid,x,y-1);
        if(y+1<grid[0].length&&grid[x][y+1]=='1')
            dfs(grid,x,y+1);

    }
}
