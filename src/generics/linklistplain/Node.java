package generics.linklistplain;

/**
 * Created by Андрей on 21.07.2017.
 */
public class Node {
    private String value;
    private Node next;

    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }
}
