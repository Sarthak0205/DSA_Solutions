package graphs;

//public class NumberOfIslands {
//    private static void dfs(char[][] grid,int row,int col,boolean[][] visited){
//        if (row<0||row>=grid.length||col<0||col>=grid[0].length||grid[row][col]=='0'||visited[row][col]){
//            return;
//        }
//        visited[row][col]=true;
//        dfs(grid, row+1, col, visited);
//        dfs(grid, row-1, col, visited);
//        dfs(grid, row, col+1, visited);
//        dfs(grid, row, col-1, visited);
//
//    }
//    public int numIslands(char[][] grid){
//        int islands=0;
//        boolean[][] visited=new boolean[grid.length][grid[0].length];
//        for (int row=0;row<grid.length;row++){
//            for (int col = 0; col < grid[0].length; col++) {
//                if (grid[row][col]=='1'&& !visited[row][col]){
//                    islands++;
//                    dfs(grid,row,col,visited);
//                }
//            }
//        }
//        return islands;
//    }
//}

//Optimised
public class NumberOfIslands {
    private static void dfs(char[][] grid,int row,int col){
        if (row<0||row>=grid.length||col<0||col>=grid[0].length||grid[row][col]=='0'){
            return;
        }
        grid[row][col]='0';
        dfs(grid, row+1, col);
        dfs(grid, row-1, col);
        dfs(grid, row, col+1);
        dfs(grid, row, col-1);

    }
    public int numIslands(char[][] grid){
        int islands=0;
        for (int row=0;row<grid.length;row++){
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col]=='1'){
                    islands++;
                    dfs(grid,row,col);
                }
            }
        }
        return islands;
    }
}
