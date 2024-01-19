class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeSum {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int sum = sumOfNodes(root);
        System.out.println("Sum of all nodes in the tree: " + sum);
    }

    // Function to calculate the sum of all nodes in a binary tree
    public static int sumOfNodes(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            // Recursively calculate the sum of nodes in the left and right subtrees
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);

            // Return the sum of the current node and the sums of the left and right subtrees
            return root.data + leftSum + rightSum;
        }
    }
}

