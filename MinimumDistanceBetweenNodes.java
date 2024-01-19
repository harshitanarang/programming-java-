class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

public class MinimumDistanceBetweenNodes {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode node1 = root.left.left;  // Node with value 6
        TreeNode node2 = root.left.right.right; // Node with value 4

        int distance = findMinimumDistance(root, node1, node2);
        System.out.println("Minimum Distance between nodes: " + distance);
    }

    // Function to find the minimum distance between two nodes in a binary tree
    public static int findMinimumDistance(TreeNode root, TreeNode node1, TreeNode node2) {
        // Find the Lowest Common Ancestor (LCA) of the two nodes
        TreeNode lca = lowestCommonAncestor(root, node1, node2);

        // Calculate the distance from each node to the LCA
        int distanceNode1 = findDistanceFromNodeToLCA(lca, node1, 0);
        int distanceNode2 = findDistanceFromNodeToLCA(lca, node2, 0);

        // Sum of distances is the minimum distance between the two nodes
        return distanceNode1 + distanceNode2;
    }

    // Function to find the Lowest Common Ancestor (LCA) of two nodes in a binary tree
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);
        TreeNode rightLCA = lowestCommonAncestor(root.right, p, q);

        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    // Function to find the distance from a node to its Lowest Common Ancestor (LCA)
    public static int findDistanceFromNodeToLCA(TreeNode lca, TreeNode node, int distance) {
        if (lca == null) {
            return -1; // Node not found in the path
        }

        if (lca == node) {
            return distance;
        }

        int leftDistance = findDistanceFromNodeToLCA(lca.left, node, distance + 1);
        int rightDistance = findDistanceFromNodeToLCA(lca.right, node, distance + 1);

        return Math.max(leftDistance, rightDistance);
    }
}
