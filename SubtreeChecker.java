class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

public class SubtreeChecker {

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(3);
        tree1.left = new TreeNode(4);
        tree1.right = new TreeNode(5);
        tree1.left.left = new TreeNode(1);
        tree1.left.right = new TreeNode(2);

        TreeNode tree2 = new TreeNode(4);
        tree2.left = new TreeNode(1);
        tree2.right = new TreeNode(2);

        boolean isSubtree = isSubtree(tree1, tree2);
        System.out.println("Is tree2 a subtree of tree1? " + isSubtree);
    }

    // Function to check if tree2 is a subtree of tree1
    public static boolean isSubtree(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return true; // An empty tree is a subtree of any tree
        }

        if (tree1 == null || tree2 == null) {
            return false; // If one of the trees is null, they can't be equal
        }

        // Check if the current subtree is equal to tree2
        if (isSameTree(tree1, tree2)) {
            return true;
        }

        // Recursively check if tree2 is a subtree of the left or right subtree of tree1
        return isSubtree(tree1.left, tree2) || isSubtree(tree1.right, tree2);
    }

    // Function to check if two trees are identical
    public static boolean isSameTree(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }

        if (tree1 == null || tree2 == null) {
            return false;
        }

        return (tree1.data == tree2.data) &&
                isSameTree(tree1.left, tree2.left) &&
                isSameTree(tree1.right, tree2.right);
    }
}
