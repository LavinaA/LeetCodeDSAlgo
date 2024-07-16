package LinkedList;

public class Link {
    public int id;
    public Link next;

    public Link(){

    }

    public Link(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }


}
