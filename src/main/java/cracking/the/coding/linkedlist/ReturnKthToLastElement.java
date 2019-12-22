package cracking.the.coding.linkedlist;

/**
 * Created by lenova on 09/12/2019.
 */
public class ReturnKthToLastElement {

    public static int printKthToLast(LinkedListNode head, int k) {

        if(head == null) {
            return 0;
        }

        int index = printKthToLast(head.next, k) + 1;
        if(index == k) {
            System.out.println(k + "th to last node is " + head.data);
        }

        return index;
    }
}
