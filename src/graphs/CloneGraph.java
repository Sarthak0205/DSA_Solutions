package graphs;

import java.util.HashMap;

public class CloneGraph {
    private static Node dfs(Node node, HashMap<Node,Node> map){
        if (map.containsKey(node)){
            return map.get(node);
        }

        Node cloneNode = new Node(node.val);
        map.put(node,cloneNode);

        for (Node neighbor:node.neighbors){
            cloneNode.neighbors.add(dfs(neighbor,map));
        }

        return cloneNode;

    }

    public Node cloneGraph(Node node) {
        if (node==null) return null;

        HashMap<Node,Node> map=new HashMap<>();

        return dfs(node,map);
    }
}
