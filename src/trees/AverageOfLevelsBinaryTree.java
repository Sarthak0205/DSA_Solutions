package trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> answer = new ArrayList<>();
        if (root==null)return answer;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize=queue.size();
            double sum=0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode node=queue.poll();

                sum+=node.val;
                if (node.left!= null) queue.offer(node.left);
                if (node.right!=null) queue.offer(node.right);
            }
            double ans=sum/levelSize;
            answer.add(ans);
        }
        return answer;
     }
}
