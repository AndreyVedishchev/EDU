package generics.linklistgen;

/**
 * Created by Андрей on 30.07.2017.
 */

public class Node<E> {
    private E value;
    private Node<E> next;


    public Node(E value, Node<E> next){
        this.value = value;
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}

