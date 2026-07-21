package graphs;

import java.util.ArrayDeque;

import java.util.Queue;

public class RottingOranges {
    private static final int[] dr={-1,1,0,0};
    private static final int[] dc={0,0,-1,1};
    public int orangesRotting(int[][] grid){

        Queue<int[]> queue=new ArrayDeque<>();
        int fresh=0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col]==1){
                    fresh++;
                }
                else if (grid[row][col]==2) {
                    queue.offer(new int[]{row, col});
                }
            }
        }

        if (fresh==0) return 0;
        int minutes=0;
        while (!queue.isEmpty() && fresh>0){
            int size=queue.size();
            for (int i=0;i<size;i++){
                int[] current=queue.poll();
                int row=current[0];
                int col=current[1];
                for (int j = 0; j < 4; j++) {
                    int newRow=row+dr[j];
                    int newCol=col+dc[j];
                    if (newRow>=0&&newRow<grid.length&&newCol>=0&&newCol<grid[0].length&&grid[newRow][newCol]==1){
                        grid[newRow][newCol]=2;
                        fresh--;
                        queue.offer(new int[]{newRow,newCol});
                    }
                }
            }
            minutes++;
        }
    return fresh==0?minutes:-1;
    }
}
