package cracking.the.coding.string;

import java.util.Arrays;

/**
 * Check Permutation: Given two strings, write a  method to decide if one is a  permutation of the other.
 * <p>
 * Note:  We will assume for this problem that the comparison is case sensitive and whitespace is significant.
 */
public class CheckPermutation {


    //Solution #1
    public boolean isPermutation(String firstValue, String secondValue) {

        // strings of different lengths cannot be permutations of each other
        if (firstValue.length() != secondValue.length()) {
            return false;
        }

        /*
        * If two strings are permutations, then we know they have the same characters, but in different orders.
        * Therefore, sorting the strings will put the characters from two permutations in the same order.
         * We just need to compare the sorted versions of the strings.
        * */
        return sort(firstValue).equals(sort(secondValue));
    }

    private String sort(String strValue) {
        char[] chars = strValue.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    //Solution #2: Check if the two strings have identical character counts.

    /*
    * We can also use the definition of a  permutation-two words with the same character counts-to implement this algorithm.
    * We simply iterate through this code, counting how many times each character appears.
    * Then, afterwards, we compare the two arrays
    * */

    /*
    *                                                           ==ASCII code's ==
    *              a,   b,  c,   d,   e,   f,   g,   h,   i,   j,   k,   l,   m,   n,   o,   p,   q,   r,   s,   t,   u,   v,   w,   x,   y,  z
    *   uppercase 65, 66, 67,  68,  69,  70,  71,  72,  73,  74,  75,  76,  77,  78,  79,  80,  81,  82,  83,  84,  85,  86   87,  88,  89,  90
    *   lowercase  97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122
    *
    *
    * */

    boolean isPermutationSolutionTwo(String firstValue, String secondValue) {

        // strings of different lengths cannot be permutations of each other
        if (firstValue.length() != secondValue.length())
            return false;

        int[] letters = new int[128]; //Assumption

        char[] charSet = firstValue.toCharArray();
        for (char c : charSet) {
            letters[c]++;
        }

        charSet = secondValue.toCharArray();
        for (char c : charSet) {
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }
        return true;
    }


}
