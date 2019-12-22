package cracking.the.coding.string;

/**
 * Palindrome Permutation: Given a  string, write a  function to check if it is a  permutation of a  palindrome.
 *                         A  palindrome is a  word or phrase that is the same forwards and backwards.
 *                         A permutation is a  rearrangement of letters.
 *                         The palindrome does not need to be limited to just dictionary words
 *
 *                         EXAMPLE Input: Tact Coa
 *                                 Output: True (permutations:"taco cat'; "atco cta'; etc.)
 *
 *
 * What does it take to be able to write a set of characters the same way forwards and backwards?
 * We need to have an even number of almost all characters, so that half can be on one side and half can be on the other side.
 * At most one character (the middle character) can have an odd count.
 */
public class Palindrome {



    /*
    *
    * This algorithm takes O(N) time, where N is the length of the string.
    * */

    public boolean isPalindrome(String phrase) {
        int[] table = buildCharFrequency(phrase);
        return checkMaxxOneOdd(table);
    }

    /*Count how many times each character appears*/
    private int[] buildCharFrequency(String phrase) {
        int[] table = new int[Character.getNumericValue('z') -
                Character.getNumericValue('a') + 1];

        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
            }
        }
        return table;
    }

    /*Map each character to a number. a -> 0, b->1, c->2, etc.
    * This is case insensitive.Non-Letter character map to -1.*/
    private int getCharNumber(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }

    /*Check that no more than one character has an odd count. */
    private boolean checkMaxxOneOdd(int[] table) {
        boolean foundOdd = false;
        for (int count : table) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }
}
