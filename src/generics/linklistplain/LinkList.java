package generics.linklistplain;

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
        int val = 0;
        Node cursor = head;

        while(cursor != null){

            cursor = cursor.getNext();
            val++;
        }

        return val;
    }
}
