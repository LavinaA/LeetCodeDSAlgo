package Trees;
/*
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

 Example 1:


Input: p = [1,2,3], q = [1,2,3]
Output: true
 */

import com.sun.org.apache.xpath.internal.operations.Bool;

public class SameTree {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        Node q1 = new Node(1);
        Node q2 = new Node(2);
        Node q3 = new Node(4);

        n1.left = n2;
        n1.right = n3;

        q1.left = q2;
        q1.right = q3;

        Boolean b = isSameTree(n1,q1);

        if(b==true){
            System.out.println("Trees are same");
        }else{
            System.out.println("Trees are not same");
        }
    }

    private static Boolean isSameTree(Node n1, Node q1) {

        if(n1==null && q1==null){
            return true;
        } if(n1==null || q1 == null){
            return false;
        }
        if(n1.id != q1.id){
            return false;
        }

        return isSameTree(n1.left,q1.left) && isSameTree(n1.right,q1.right);

    }
}
