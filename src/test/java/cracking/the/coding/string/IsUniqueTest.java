package cracking.the.coding.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lenova on 05/12/2019.
 */
public class IsUniqueTest {

    private IsUnique isUnique;

    @Before
    public void initiateIsUnique() {
        isUnique = new IsUnique();
    }

    @Test
    public void testIsUniqueString() {
        assertTrue(isUnique.isUniqueString("YesNo"));
        assertTrue(isUnique.isUniqueString("yY"));
        assertFalse(isUnique.isUniqueString("yaa"));
    }

}