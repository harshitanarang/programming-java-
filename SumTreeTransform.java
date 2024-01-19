class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

public class SumTreeTransform {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(-2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(-4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(5);

        System.out.println("Original Tree:");
        printInorder(root);

        transformToSumTree(root);

        System.out.println("\nSumTree:");
        printInorder(root);
    }

    // Function to transform a binary tree into a SumTree
    public static void transformToSumTree(TreeNode root) {
        if (root == null) {
            return;
        }

        // Recursive postorder traversal
        transformToSumTree(root.left);
        transformToSumTree(root.right);

        // Save the original value of the current node
        int oldValue = root.data;

        // Update the value of the current node to the sum of its left and right subtrees
        root.data = (root.left != null ? root.left.data : 0) + (root.right != null ? root.right.data : 0);

        // Add the original value to the sum, making it the new value of the current node
        root.data += oldValue;
    }

    // Function to print the inorder traversal of a tree
    public static void printInorder(TreeNode node) {
        if (node == null) {
            return;
        }

        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
}
