package SDEChallenge;

import java.util.ArrayList;

public class SetMatrixZero {
//    public void setZero(int [][] matrix){
//        ArrayList<int[]> zeros = new ArrayList<>();
//        int m= matrix.length;
//        int n=matrix[0].length;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (matrix[i][j] == 0) {
//                    zeros.add(new int[]{i, j});
//                }
//            }
//        }
//        for (int i = 0; i < zeros.size(); i++) {
//            int[] pos = zeros.get(i);
//            int row = pos[0];
//            int col = pos[1];
//            for (int j = 0; j < n; j++) {
//                matrix[row][j]=0;
//            }
//            for (int j = 0; j < m; j++) {
//                matrix[j][col]=0;
//            }
//        }
//    }

    public void setZeros(int [][] matrix)
    {
        int m = matrix.length;
        int n=matrix[0].length;
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0){
                    rows[i]=true;
                    cols[j]= true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(rows[i]||cols[j]){
                    matrix[i][j]=0;
                }
            }
        }

    }
}
