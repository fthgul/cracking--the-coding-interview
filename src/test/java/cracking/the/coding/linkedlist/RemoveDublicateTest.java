package cracking.the.coding.linkedlist;

import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;

/**
 * Created by lenova on 08/12/2019.
 */
public class RemoveDublicateTest {
    private RemoveDublicate removeDublicate;

    @Before
    public void inititate() {
        removeDublicate = new RemoveDublicate();
    }

    @Test
    public void testRemoveDubliate() {
        LinkedListNode first = new LinkedListNode(0, null, null);
        LinkedListNode head = first;
        LinkedListNode second;
        for (int i = 1; i < 8 ; i++) {
            second = new LinkedListNode(i % 2, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }

       // removeDublicate.deleteDublicate(head);
        removeDublicate.removeDubs(head);
        List<Integer> list = new ArrayList<Integer>();
        while(head != null) {
            list.add(head.data);
            head = head.next;
        }

       assertEquals(list.size(),2);
        for (int i = 0; i < list.size(); i++) {
            assertTrue( i == list.get(i));
        }


    }


}