package LinkedList;

/*
Example 1:
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]

Example 2:
Input: head = [], val = 1
Output: []

Example 3:
Input: head = [7,7,7,7], val = 7
Output: []
 */

public class RemoveLinkListElements {
    public static void main(String[] args) {
        Link l1 = new Link(1);
        Link l2 = new Link(2);
        Link l3 = new Link(6);
        Link l4 = new Link(3);
        Link l5 = new Link(4);
        Link l6 = new Link(5);
        Link l7 = new Link(6);

        l1.next = l2;
        l2.next = l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
        l6.next=l7;

        int val = 6;

        Link first = removeElement(l1,val);
        displayLink(first);


    }

    private static void displayLink(Link first) {
        Link current = first;
        while(current!=null){
            System.out.print(current.id + " -> ");
            current=current.next;
        }
    }

    private static Link removeElement(Link first, int val) {

            Link current = first;
            Link prev = null;


            while(current!=null){

                if(current.id==val){

                    if(prev==null){
                        current=current.next;
                    }else if(current.next==null){
                        prev.next=null;
                    }else{
                        prev.next=current.next;
                    }
                }
                prev=current;
                current=current.next;
            }

            return first;

    }

}
