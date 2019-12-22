package cracking.the.coding.linkedlist;

/**
 * Created by lenova on 09/12/2019.
 */
public class LinkedListNode {
    public LinkedListNode next;
    public LinkedListNode prev;
    public LinkedListNode last;
    public int data;
    public LinkedListNode(int d, LinkedListNode n, LinkedListNode p) {
        data = d;
        setNext(n);
        setPrevious(p);
    }

    public LinkedListNode() {}


    public void setNext(LinkedListNode n) {
        next = n;
        if(this == last) {
            last = n;
        }
        if(n != null && n.prev != this) {
            n.setPrevious(this);
        }
    }

    public void setPrevious(LinkedListNode p) {
        prev = p;
        if(p != null && p.next != this) {
            p.setNext(this);
        }
    }
}
