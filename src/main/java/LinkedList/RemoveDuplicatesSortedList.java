package LinkedList;

public class RemoveDuplicatesSortedList {
    public static void main(String[] args) {

        Link l1 = new Link(1);
        Link l2 = new Link(1);
        Link l3 = new Link(2);
        Link l4 = new Link(3);
        Link l5 = new Link(3);

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;

        Link link = removeDuplicate(l1);
        displayLink(link);

    }

    private static void displayLink(Link first) {
        Link current = first;
        while(current!=null){
            System.out.print(current.id + " -> ");
            current=current.next;
        }
    }
    private static Link removeDuplicate(Link first) {

        Link current = first;
        while (current != null && current.next!=null) {
            if (current.id == current.next.id) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }


        return first;

    }
}
