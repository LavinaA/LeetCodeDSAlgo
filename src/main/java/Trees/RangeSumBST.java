package Trees;
/*
Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].

Example 1:


Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
Output: 32
Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
 */

public class RangeSumBST {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(5);
        Node n3 = new Node(15);
        Node n4 = new Node(3);
        Node n5 = new Node(7);
        Node n6 = new Node(18);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;

        int low = 7;
        int high =15;

        int sum = rangeSumBST(n1,low,high);
        System.out.println("Sum=" + sum);
    }

    private static int rangeSumBST(Node root, int low, int high) {

        if (root == null) {
            return 0;
        } else {
            int sum = 0;
            if (root.id >= low && root.id <= high) {
                sum += root.id;
            }
                sum += rangeSumBST(root.left, low, high);
                sum += rangeSumBST(root.right, low, high);
            return sum;
        }

    }
}
