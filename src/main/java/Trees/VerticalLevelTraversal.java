package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerticalLevelTraversal {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        Map<Integer, List<Node>> map = new HashMap<Integer,List<Node>>();

        verticalLevelTraversal(n1,map,1);

        for(Map.Entry<Integer,List<Node>> entry : map.entrySet()){
            System.out.println("Level " + entry.getKey() +" has " +entry.getValue());
        }
}

    private static void verticalLevelTraversal(Node node, Map<Integer, List<Node>> map, int level) {

        if(node!=null) {
            if (map.get(level) == null) {
                ArrayList list = new ArrayList();
                list.add(node.id);
                map.put(level, list);
            } else {
                List l = map.get(level);
                l.add(node);
            }
            verticalLevelTraversal(node.left,map,level-1);
            verticalLevelTraversal(node.right,map,level+1);

        }


    }
    }
