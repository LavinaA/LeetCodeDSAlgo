package LinkedList;

public class RemoveElementOnKey {
    public static void main(String[] args) {
            Link l1 = new Link(10);
            Link l2= new Link(20);
            Link l3 = new Link(30);
            Link l4 = new Link(10);
            Link l5 = new Link(50);
            Link l6 = new Link(10);
            l1.next = l2;
            l2.next = l3;
            l3.next= l4;
            l4.next=l5;
            l5.next=l6;
            int key = 10;

            Link first = removeElementOnKey(l1,key);
            displayLink(first);
    }


    private static Link removeElementOnKey(Link first, int key) {

        Link current = first;
        Link prev = null;

        while (current != null) {

            if(current.id == key){
                if(prev==null){
                    first = current.next;
                }else if (current.next ==null){
                    prev.next = null;
                }else{
                    prev.next = current.next;
                }
            }
            prev = current;
            current = current.next;
        }

        return first;
    }

    private static void displayLink(Link first) {
        Link current = first;
        while(current!=null){
            System.out.print(current.id + " ->");
            current=current.next;
        }
    }

}
