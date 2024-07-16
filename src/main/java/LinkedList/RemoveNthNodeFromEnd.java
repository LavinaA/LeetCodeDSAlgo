package LinkedList;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        Link l1 = new Link(10);
        Link l2= new Link(20);
        Link l3 = new Link(30);
        Link l4 = new Link(40);
        Link l5 = new Link(50);
        Link l6 = new Link(60);

        l1.next = l2;
        l2.next = l3;
        l3.next= l4;
        l4.next=l5;
        l5.next=l6;

        int nodeTobeDeletedFromEnd = 3;
        Link first = removeNthNodeFromEnd(l1,nodeTobeDeletedFromEnd);

        displayLink(first);

    }

    private static void displayLink(Link first) {
        Link current = first;
        while(current!=null){
            System.out.print(current.id + " ->");
            current=current.next;
        }

    }

    private static Link removeNthNodeFromEnd(Link first, int n) {
        if (first == null) {
            return first;
        }

        Link current = first, prev = null;
        //int count = 1;
        Link runner = first;

        for(int i=1;i<=n;i++){
            runner = runner.next;
        }

        while (runner != null) {
            prev = current;
            current = current.next;
            runner = runner.next;
        }

        if (current == first) {         // first node to be deleted
            first = first.next;
        } else if (current.next == null) {              // last node to be deleted
            prev.next = null;
        } else {        // middle node to be deleted
            prev.next = current.next;
        }

        return first;



    }
}
