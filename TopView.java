import java.util.Queue;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

public class TopView {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("Top View of the Tree:");
        printTopView(root);
    }

    // Function to print the top view of a binary tree
    public static void printTopView(TreeNode root) {
        if (root == null) {
            return;
        }

        // Queue to perform level-order traversal
        Queue<TreeNodeWithHD> queue = new LinkedList<>();
        // TreeMap to store the top view nodes based on horizontal distance
        Map<Integer, Integer> topViewMap = new TreeMap<>();

        // Enqueue the root with horizontal distance 0
        queue.add(new TreeNodeWithHD(root, 0));

        while (!queue.isEmpty()) {
            TreeNodeWithHD currentNode = queue.poll();
            int currentHD = currentNode.hd;
            TreeNode currentNodeRef = currentNode.node;

            // If this horizontal distance is not present in the map, add it
            if (!topViewMap.containsKey(currentHD)) {
                topViewMap.put(currentHD, currentNodeRef.data);
            }

            // Enqueue the left and right children with updated horizontal distances
            if (currentNodeRef.left != null) {
                queue.add(new TreeNodeWithHD(currentNodeRef.left, currentHD - 1));
            }
            if (currentNodeRef.right != null) {
                queue.add(new TreeNodeWithHD(currentNodeRef.right, currentHD + 1));
            }
        }

        // Print the top view nodes
        for (int value : topViewMap.values()) {
            System.out.print(value + " ");
        }
    }

    // Helper class to represent a TreeNode with horizontal distance
    static class TreeNodeWithHD {
        TreeNode node;
        int hd;

        public TreeNodeWithHD(TreeNode node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
}
