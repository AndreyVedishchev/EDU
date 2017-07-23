package generics;

public class LinkList {
    private Node head;

    public void put(String value){
        Node new_ = new Node(value, head);
        head = new_;
    }

//todo!!!
    public String extract(){
        String lastValue = null;
        if (head != null) {
            lastValue = head.getValue();
            head = head.getNext();
        }
        return lastValue;
    }
}
