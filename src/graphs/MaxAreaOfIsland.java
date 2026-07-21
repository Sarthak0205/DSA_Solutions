package graphs;

public class MaxAreaOfIsland {
    private static int dfs(int[][] grid,int row,int col){
        if (row<0||row>=grid.length||col<0||col>=grid[0].length||grid[row][col]!=1){
            return 0;
        }
        grid[row][col]=0;
        int up=dfs(grid,row-1,col);
        int down=dfs(grid,row+1,col);
        int left=dfs(grid,row,col-1);
        int right=dfs(grid,row,col+1);

        return 1+up+down+left+right;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea=Integer.MIN_VALUE;
        for (int row = 0; row < grid.length; row++) {
            for (int col=0;col<grid[0].length;col++){
                if (grid[row][col]==1){
                    maxArea=Math.max(maxArea,dfs(grid,row,col));
                }
            }
        }
        return maxArea;
    }
}
