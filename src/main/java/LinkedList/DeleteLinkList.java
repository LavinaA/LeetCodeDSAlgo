package LinkedList;

 class Client{
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

         displayLink(l1);
         System.out.println();


         Link first = l1;
         first = deleteLink(first,60);
         System.out.println(" The Link list after deletion is ");
         displayLink(first);


     }

     private static void displayLink(Link first) {
         Link current = first;
         while(current!=null){
             System.out.print(current.id + " ->");
             current=current.next;
         }

     }

     private static Link deleteLink(Link first, int data) {

         // Link list is empty
         if(first==null){
             return null;
         }

         if(first.next==null){
             if(first.id==data) {
                 first = null;
                 return first;
             }
         }


         Link prev=null;
         Link current = first;

         while(current!=null){

             if(current.id == data){
                 if(prev==null){
                     first = first.next;
                 }else if (current.next==null){
                     prev.next=null;
                 }else{
                     prev.next= current.next;
                 }
             }
             prev = current;
             current=current.next;

         }

         return first;
     }

 }






/*public class DeleteLinkList {







}*/
