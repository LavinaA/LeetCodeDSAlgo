package Trees;


class BSTClient{
    public static void main(String[] args) {

        AddElementBinaryTree tree = new AddElementBinaryTree();
        tree.addData(50);
        tree.addData(25);
        tree.addData(75);
        tree.addData(15);
        tree.addData(35);
        tree.addData(80);

        preOrderTraversal(tree.root);


    }

    private static void preOrderTraversal(Node node) {
        if(node == null){
            return;
        }

        System.out.print(node.id + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);


    }
}


public class AddElementBinaryTree {

    Node root;
public void addData(int id){

    Node n = new Node(id);
    Node current = root;
    Node parent = null;


    if(root==null){
        root =n;
        return;
    }

    if(current.id == id){
        return;
    }

    while(true){
        //Node parent;
        parent=current;
        if(current.id < id){
            current = current.right;
            if(current==null){
                parent.right = n;
                break;
            }
        }else if(current.id > id){
            current = current.left;
            if(current == null){
                parent.left = n;
                break;
            }
        }

    }


















}



}



