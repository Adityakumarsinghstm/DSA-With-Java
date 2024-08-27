package Tree;

import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class LeetCode590 {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String detail :details)
        {
            String age = detail.substring(11,13);
            int ageVal = Integer.parseInt(age);
            if (ageVal>60)
            {
                count++;
            }
        }
        return count;
    }
}
//    public List<Integer> postorder(Node root) {
//}
