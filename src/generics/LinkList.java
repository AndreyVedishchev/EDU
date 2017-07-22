package generics;

/**
 * Created by Андрей on 21.07.2017.
 */
public class LinkList {
    private Node head;
    String early;


    public void put(String value){
        Node new_ = new Node(value, head);
        head = new_;

    }
//todo!!!
    public String extract(){
        head = null;
        return head.getValue();
    }

}
