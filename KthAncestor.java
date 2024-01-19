class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

public class KthAncestor {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        TreeNode node = root.left.left;  // Node with value 4
        int k = 2;

        TreeNode kthAncestor = findKthAncestor(root, node, k);
        if (kthAncestor != null) {
            System.out.println("Kth Ancestor of Node " + node.data + " at distance " + k + ": " + kthAncestor.data);
        } else {
            System.out.println("No Kth Ancestor found.");
        }
    }

    // Function to find the k-th ancestor of a node in a binary tree
    public static TreeNode findKthAncestor(TreeNode root, TreeNode node, int k) {
        // Array to store ancestors
        TreeNode[] ancestors = new TreeNode[k + 1];

        // Helper function to perform DFS and find the k-th ancestor
        findKthAncestorHelper(root, node, k, ancestors);

        // Check if k-th ancestor exists
        return (k < ancestors.length) ? ancestors[k] : null;
    }

    private static boolean findKthAncestorHelper(TreeNode root, TreeNode node, int k, TreeNode[] ancestors) {
        if (root == null) {
            return false;
        }

        // If the current node is the target node
        if (root == node) {
            return true;
        }

        // Recursively search in the left and right subtrees
        if (findKthAncestorHelper(root.left, node, k, ancestors) || findKthAncestorHelper(root.right, node, k, ancestors)) {
            // Store the current ancestor in the array
            if (k > 0) {
                ancestors[k - 1] = root;
            }

            return true;
        }

        return false;
    }
}
