package LinkedList;

public class ReverseLinkList {
    public static void main(String[] args) {
        Link l1 = new Link(10);
        Link l2 = new Link(20);
        Link l3 = new Link(30);
        Link l4 = new Link(40);
        Link l5 = new Link(50);

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;

        Link node = reverseLinkList(l1);
        displayLink(node);

    }

    private static void displayLink(Link first) {
        Link current = first;
        while(current!=null){
            System.out.print(current.id + " -> ");
            current=current.next;
        }
    }

    private static Link reverseLinkList(Link first) {

        Link prev = null;
        Link current = first;


        while(current != null) {
            Link temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;

    }
}
