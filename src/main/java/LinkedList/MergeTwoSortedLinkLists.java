package LinkedList;
/*You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 */

public class MergeTwoSortedLinkLists {
    public static void main(String[] args) {
        Link l1 = new Link(1);
        Link l2 = new Link(2);
        Link l3 = new Link(4);
        Link l4 = new Link(5);
        Link l5 = new Link(6);

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;

        Link ll1 = new Link(1);
        Link ll2= new Link(3);
        Link ll3 = new Link(4);

        ll1.next = ll2;
        ll2.next=ll3;

        Link first = mergeTwoLists(l1,ll1);
        displayLink(first);

    }

    private static void displayLink(Link first) {
        Link current = first;
        while(current!=null){
            System.out.print(current.id + " -> ");
            current=current.next;
        }
    }

    private static Link mergeTwoLists(Link list1, Link list2) {

        Link dummy = new Link();
        Link current = dummy;

        //displayLink(dummy);
        //System.out.println();

        while (list1 != null && list2 != null) {
            if(list1.id<=list2.id){
                current.next = list1;
                list1=list1.next;
            }else{
                current.next = list2;
                list2=list2.next;
            }

            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        }else {
           current.next= list2;

            }

return dummy.next;

    }
}
