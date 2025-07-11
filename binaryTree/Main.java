import java.util.*;

class Main {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void level(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                System.out.println();
                if (q.isEmpty()) break;
                else q.add(null);
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
    }

    public static int height(Node root) {
        if (root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static int count(Node root) {
        if (root == null) return 0;
        return count(root.left) + count(root.right) + 1;
    }

    public static int sum(Node root) {
        if (root == null) return 0;
        return sum(root.left) + sum(root.right) + root.data;
    }

    public static int diameter(Node root) {
        if (root == null) return 0;
        int diam1 = height(root.left) + height(root.right) + 1;
        int diam2 = diameter(root.left);
        int diam3 = diameter(root.right);
        return Math.max(diam1, Math.max(diam2, diam3));
    }

    static class TreeInfo {
        int diam;
        int ht;

        TreeInfo(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static TreeInfo diameter2(Node root) {
        if (root == null) return new TreeInfo(0, 0);

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHt = Math.max(left.ht, right.ht) + 1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(diam3, Math.max(diam1, diam2));

        return new TreeInfo(myDiam, myHt);
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = binaryTree.buildTree(nodes);

        System.out.print("Preorder: "); preorder(root); System.out.println();
        System.out.print("Inorder: "); inorder(root); System.out.println();
        System.out.print("Postorder: "); postorder(root); System.out.println();
        System.out.println("Level Order:");
        level(root);

        System.out.println("Height: " + height(root));
        System.out.println("Count: " + count(root));
        System.out.println("Sum: " + sum(root));
        System.out.println("Diameter (O(n^2)): " + diameter(root));
        System.out.println("Diameter (Optimized O(n)): " + diameter2(root).diam);
    }
}
