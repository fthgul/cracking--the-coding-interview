package cracking.the.coding.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by lenova on 08/12/2019.
 */
public class OneWayTest {
    private OneWay oneWay;

    @Before
    public void instiate() {
        oneWay = new OneWay();
    }

    @Test
    public void oneWayTest() {
        assertTrue(oneWay.isOneWayEdit("pales", "pale"));
        assertTrue(oneWay.isOneWayEdit("bale", "pale"));
        assertTrue(oneWay.isOneWayEdit("apple", "aple"));
    }
}
