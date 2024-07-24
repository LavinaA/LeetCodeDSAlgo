package Trees;

public class Node {

    public int id;

   public Node left;
    public Node right;

   public boolean visited;

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public Node(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "id "+ getId();
    }
}
