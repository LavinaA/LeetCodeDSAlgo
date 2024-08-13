package Trees;
/*
Given the root of a binary tree, return the sum of all left leaves.

A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.

Input: root = [3,9,20,null,null,15,7]
Output: 24
Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.
Example 2:

Input: root = [1]
Output: 0
 */

public class SumOfLeftLeaves {
    public static void main(String[] args) {
        Node n1 = new Node(3);
        Node n2 = new Node(9);
        Node n3 = new Node(20);
        Node n4 = new Node(15);
        Node n5 = new Node(7);

        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;

        int sum = sumOfLeftLeaves(n1);
        System.out.println("The sum of left leaves is "+sum);

    }

    private static int sumOfLeftLeaves(Node root) {
        if (root ==null){
            return 0;
        }
        int sum =0;
        if(root.left!=null){
            if(root.left.left==null && root.left.right==null){
                sum = sum + root.left.id;
            }else{
                sum = sum+sumOfLeftLeaves(root.left);
            }
        }
        sum= sum+sumOfLeftLeaves(root.right);
        return sum;
    }
}
