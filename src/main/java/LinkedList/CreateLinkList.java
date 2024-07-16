package LinkedList;



class LinkedListClient{
    public static void main(String[] args) {

        CreateLinkList linklist = new CreateLinkList();
        linklist.addLinkListInLast(10);
        linklist.addLinkListInLast(20);
        linklist.addLinkListInLast(30);
        linklist.addLinkListInLast(40);
        linklist.addLinkListInLast(50);
        linklist.displayLink();

        Boolean b = linklist.searchLink(25,linklist.first);
        if(b==true){
            System.out.println("Element Found");
        } else{
            System.out.println("Element not found");
        }


    }




}

public class CreateLinkList {

    Link first;
    public void addLinkListInLast(int id) {

        Link newLink = new Link(id);

        if (first == null) {
            first = newLink;
            return;
        }

        Link prev;
        Link current = first;
        while (current != null) {
            prev = current;
            current = current.next;
            if (current == null) {
                prev.next = newLink;
            }
        }

    }

    public void displayLink(){
        Link current = first;
        while (current != null) {
            System.out.print(current.id +" -> ");
            current= current.next;
        }
    }

    public boolean searchLink(int data, Link first) {
        Link current = first;

        while (current != null) {
            if(current.id==data){
                return true;
            }else {
                current=current.next;
            }
        }
return false;

    }
}



