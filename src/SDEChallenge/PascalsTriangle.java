package SDEChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row1  =new ArrayList<>(List.of(1));
        result.add(row1);
        for (int i = 1; i <numRows ; i++) {
            List<Integer> prevRow = new ArrayList<>();
            prevRow = result.get(i-1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j = 0; j < prevRow.size()-1; j++) {
                int sum = prevRow.get(j) + prevRow.get(j+1);
                currentRow.add(sum);
            }
            currentRow.add(1);
            result.add(currentRow);
        }
        return result;
    }

    static void main() {
        List<List<Integer>> list =new ArrayList<>();
        list = generate(5);
        for(List<Integer> row:list){
            System.out.println(row);
        }
    }
}
