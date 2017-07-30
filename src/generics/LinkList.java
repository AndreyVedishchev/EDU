package generics;

public class LinkList {
    private Node head;

    public void put(String value){
        Node new_ = new Node(value, head);
        head = new_;
    }


    public String extract(){
        String value;
        if (head != null) {
            value = head.getValue();

            head = head.getNext();
            return value;
        }
        else return null;
    }


    public int size() {
        if (head == null)
        return 0;
    }
}
