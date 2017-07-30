package generics.linklistgen;

/**
 * Created by Андрей on 30.07.2017.
 */
public class LinkList<E> {
    private Node<E> head;

    public void put(E value) {
        Node<E> new_ = new Node<>(value, head);
        head = new_;
    }

    public E extract() {
        E value;
        if (head != null) {
            value = head.getValue();

            head = head.getNext();
            return value;
        }
        else return null;
    }

    public int size() {
        int val = 0;
        Node<E> cursor = head;

        while(cursor != null){

            cursor = cursor.getNext();
            val++;
        }

        return val;
    }

}
