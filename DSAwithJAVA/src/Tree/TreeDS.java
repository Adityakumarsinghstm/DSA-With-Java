package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeDS {
    class TreeNode<E>{
        TreeNode left;
        TreeNode right;
        E data;

        public TreeNode( E data) {
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }
    public ArrayList<Integer> BFS(TreeNode<Integer> root)
    {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            TreeNode<Integer> node = queue.poll();
            res.add(node.data);

            if(node.left != null)
            {
                queue.offer(node.left);
            }
            if(node.right != null)
            {
                queue.offer(node.right);
            }
        }
        return  res;
    }
    public static void main(String[] args) {

    }
}
