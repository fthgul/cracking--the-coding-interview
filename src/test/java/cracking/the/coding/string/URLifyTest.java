package cracking.the.coding.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lenova on 07/12/2019.
 */
public class URLifyTest {

    private URLify urLify;

    @Before
    public void inititateURLify() {
        urLify = new URLify();
    }

    @Test
    public void testURLify() {
        Assert.assertEquals(urLify.getURlify("Mr John Smith  "),new String("Mr%20John%20Smith"));
        Assert.assertEquals(urLify.replaceSpaces("Mr John Smith   "),new String("Mr%20John%20Smith"));
        Assert.assertEquals(urLify.replaceSpaces("This is replacement    "),new String("This%20is%20replacement"));
        Assert.assertEquals(urLify.replaceSpaces("Oooo myGod"),new String("Oooo%20myGod"));
    }
}
