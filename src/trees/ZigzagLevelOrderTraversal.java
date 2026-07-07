package trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer=new ArrayList<>();
        if (root==null) return answer;
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.offer(root);
        boolean leftToRight=true;
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            List<Integer> level=new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node=queue.poll();
                if (leftToRight)
                    level.add(node.val);
                else level.add(0,node.val);
                if (node.left!=null) queue.offer(node.left);
                if (node.right!=null) queue.offer(node.right);

            }
            answer.add(level);
            leftToRight=!leftToRight;
        }
        return answer;
    }
}
