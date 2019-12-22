package cracking.the.coding.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by lenova on 09/12/2019.
 */
public class ReturnKthToLastElementTest {
    private ReturnKthToLastElement returnKthToLastElement;

    @Before
    public void inititate() {
        returnKthToLastElement = new ReturnKthToLastElement();
    }

    @Test
    public void testKthToLastElement() {
        LinkedListNode first = new LinkedListNode(0, null, null);
        LinkedListNode head = first;
        LinkedListNode second;
        for (int i = 1; i < 8 ; i++) {
            second = new LinkedListNode(i , null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }

        returnKthToLastElement.printKthToLast(head, 9);
    }
}
