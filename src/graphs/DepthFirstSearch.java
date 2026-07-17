package graphs;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {
    public static void dfs(int node,List<List<Integer>> graph,boolean[] visited){
        visited[node]=true;
        for (int neighbour : graph.get(node)){
            if (!visited[neighbour]){
                dfs(neighbour,graph,visited);
            }
        }
    }

    static void main() {
        int n=5;
        List<List<Integer>> graph = new ArrayList<>();
        int[][] edges = { {0,1},
                {0,2},
                {1,3},
                {2,4}
        };
        for (int i=0;i<n;i++){
            graph.add(new ArrayList<Integer>());
        }
        for (int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u); //only for undirected graphs
        }

    }
}
