class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeHeight {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int height = treeHeight(root);
        System.out.println("Height of the tree: " + height);
    }

    // Function to find the height of a binary tree
    public static int treeHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            // Compute the height of the left and right subtrees
            int leftHeight = treeHeight(root.left);
            int rightHeight = treeHeight(root.right);

            // Return the maximum of the two heights, plus 1 for the current node
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
