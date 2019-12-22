package cracking.the.coding.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by lenova on 07/12/2019.
 */
public class CheckPermutationTest {

    private CheckPermutation checkPermutation;

    @Before
    public void initiateCheckPermutationClass() {
        checkPermutation= new CheckPermutation();
    }

    @Test
    public void testIsPermutation() {
        assertTrue(checkPermutation.isPermutation("dog", "god"));
        assertFalse(checkPermutation.isPermutation("dog  ", "god"));
        assertFalse(checkPermutation.isPermutation("perm", "pert"));
    }

    @Test
    public void testIsPermutationSlutionTwo() {
        assertTrue(checkPermutation.isPermutationSolutionTwo("dog", "god"));
        assertFalse(checkPermutation.isPermutationSolutionTwo("perm", "pert"));
    }

}
