package cracking.the.coding.linkedlist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by lenova on 08/12/2019.
 */
public class RemoveDublicate {

    //with buffer solution
    public void deleteDublicate(LinkedListNode node) {
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode previous = null;
        while (node != null) {
            if (set.contains(node.data)) {
                previous.next = node.next;
            } else {
                set.add(node.data);
                previous = node;
            }
            node = node.next;
        }
    }

    //without buffer an alternative ways
    public void removeDubs(LinkedListNode head) {

        LinkedListNode current = head;

        while (current != null) {
            LinkedListNode runner = current;

            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }

    }
}
