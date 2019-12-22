package cracking.the.coding.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by lenova on 08/12/2019.
 */
public class PalindromTest {

    private Palindrome palindrome;

    @Before
    public void inititatePalindrome() {
        palindrome = new Palindrome();
    }

    @Test
    public void palindromeTest() {
        assertTrue(palindrome.isPalindrome("Tact Coa"));
        assertTrue(palindrome.isPalindrome("acca"));
    }
}
