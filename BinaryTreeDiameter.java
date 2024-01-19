class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeDiameter {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int diameter = diameterOfBinaryTree(root);
        System.out.println("Diameter of the tree: " + diameter);
    }

    // Function to calculate the diameter of a binary tree
    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // Calculate heights of left and right subtrees
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Calculate diameter of left and right subtrees
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);

        // Return the maximum of the three quantities
        return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
    }

    // Function to calculate the height of a binary tree
    public static int height(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max(height(node.left), height(node.right));
        }
    }
}
