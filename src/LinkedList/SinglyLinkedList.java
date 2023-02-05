package LinkedList;

public class SinglyLinkedList<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;
        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
        public E getElement() {
            return element;
        }
        public Node<E> getNext() {
            return next;
        }
        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
    //----------Instance variable of SinglyLinkedList--------------
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size= 0;
    public SinglyLinkedList() {}
    //----------Access Methods-----------
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size==0;
    }
    public E first() {
        if(isEmpty()){
            return null;
        }
        return head.getElement();
    }
    public E last() {
        if(isEmpty()){
            return null;
        }
        return tail.getElement();
    }
    //------------------Update Methods---------------------
    public void addFirst(E element) {
        head = new Node<>(element, head);
        if(size == 0){
            tail = head;
        }
        size++;
    }
    public void addLast(E element) {
        Node<E> newest = new Node<>(element, null);
        if(isEmpty()){
            head = newest;
        }
        else {
            tail.setNext(newest);
        }
        tail = newest;
        size++;
    }
    public E removeFirst() {
        if(isEmpty()) {
            return null;
        }
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if(size == 0){
            tail = null;
        }
        return answer;
    }
}