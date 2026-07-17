package graphs;

import java.util.ArrayDeque;
import java.util.List;

public class BreadthFirstSearch {
    public static void bfs(int start, List<List<Integer>> graph,boolean[] visited){
        ArrayDeque<Integer> queue=new ArrayDeque<>();
        queue.offer(start);
        visited[start] =true;
        while (!queue.isEmpty()){
            int node = queue.poll();
            System.out.println(node);
            for (int neighbor:graph.get(node)){
                if (!visited[neighbor]){
                    visited[neighbor]=true;
                    queue.offer(neighbor);
                }
            }
        }
    }
}
