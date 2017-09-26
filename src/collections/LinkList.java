package collections;

import generics.linklistgen.Node;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


//todo должно дополнять функциональсть generics.linklistgen.LinkList
public class LinkList<E> implements List {
    private Node<E> head;

    @Override
    public int size() {
        int val = 0;
        Node<E> cursor = head;

        while(cursor != null){
            cursor = cursor.getNext();
            val++;
        }
        return val;
    }

    @Override
    public boolean isEmpty() {
        if(head == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        Node<E> cursor = head;

        while (cursor != null) {

            if(cursor.getValue().equals(o)) {
                return true;
            }
            cursor = cursor.getNext();
        }
        return false;
    }
    //
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Node<E> cursor = head;
        Object[] arr = new Object[this.size()];
        int number = 0;

        while (cursor != null) {
            arr[number++] = cursor.getValue();
            cursor = cursor.getNext();
        }
        return arr;
    }

    @Override
    public boolean add(Object o) {
        Node<E> cursor = head;



        Node<E> node = new Node<>((E) o, head);
        head = node;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Node<E> cursor = head;
        Node<E> prev = null;
        while (cursor != null) {

            if (cursor.getValue().equals(o)){
                if (prev != null) prev.setNext(cursor.getNext());
                else head = cursor.getNext();
                return true;
            }
            prev = cursor;
            cursor = cursor.getNext();
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        if (head != null) {
            head = null;
        }
    }

    @Override
    public Object get(int index) {
        int cnt = 0;
        Node<E> cursor = head;

        if (head != null && index >= 0) {
            while (cnt != index) {
                cursor = cursor.getNext();
                cnt++;
            }
            return cursor;
        }
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }
    //
    @Override
    public ListIterator listIterator() {
        return null;
    }
//
    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }
//
    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }
//
    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
