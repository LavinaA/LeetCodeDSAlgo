package LinkedList;

public class AddTwoNumbers {
    public static void main(String[] args) {

        Link l1 = new Link(1);
        Link l2 = new Link(2);
        Link l3 = new Link(4);
        Link l4 = new Link(5);
        Link l5 = new Link(6);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        Link ll1 = new Link(1);
        Link ll2 = new Link(3);
        Link ll3 = new Link(4);
        Link ll4 = new Link(5);

        ll1.next = ll2;
        ll2.next = ll3;
        ll3.next = ll4;

        Link node = addTwoNumbers(l1,ll1);
        displayLink(node);

    }

    private static void displayLink(Link first) {
        Link current = first;
        while(current!=null){
            System.out.print(current.id + " -> ");
            current=current.next;
        }
    }


    private static Link addTwoNumbers(Link l1, Link l2) {

        Link dummy = new Link();
        Link current = dummy;

        Link currentl1 = l1;
        Link currentl2 = l2;

        int carry =0;

        while(currentl1!=null || currentl2!=null ){

            int sum = 0;

            if(currentl1!=null){
                sum = sum + currentl1.id;
                currentl1 = currentl1.next;
            }

            if(currentl2!=null){
                sum = sum + currentl2.id;
                currentl2 = currentl2.next;
            }

            sum = sum +carry;
            carry=sum/10;
            int n =sum%10;

            Link newNode = new Link(n);
            current.next = newNode;
            current=current.next;


        }
        if(carry!=0){
            Link newNode = new Link(carry);
            current.next = newNode;
            //current =current.next;
        }


        return dummy.next;


    }


}
