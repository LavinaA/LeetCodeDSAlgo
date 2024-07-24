package Trees;

public class ClosestBinarySearchTreeValue {
    public static void main(String[] args) {
        Node n1 = new Node(4);
        Node n2 = new Node(2);
        Node n3 = new Node(5);
        Node n4 = new Node(1);
        Node n5 = new Node(3);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;

        double target = 3.714286;

        int value = closestValue(n1, target);
        System.out.println(" The closest value to " + target + " is " +value);
    }

    private static int closestValue(Node root, double target) {
        int closestValue = root.id;

        while (root != null) {
            int curr = root.id;
            if (Math.abs(curr - target) < Math.abs(closestValue - target)) {
                closestValue = curr;
            } else if (Math.abs(curr - target) == Math.abs(closestValue - target)) {
                closestValue = Math.min(curr, closestValue);
            }

            root = target < root.id ? root.left : root.right;
        }

        return closestValue;


    }
}
