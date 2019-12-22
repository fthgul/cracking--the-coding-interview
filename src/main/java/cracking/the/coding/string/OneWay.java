package cracking.the.coding.string;

/**
 *
 * One Away: There are three types of edits that can be performed on strings: "insert" a  character, "remove" a character, or "replace" a character.
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 *
 *  EXAMPLE pale, ple -> true
 *          pales, pale -> true
 *          pale, bale -> true
 *          pale, bae -> false
 *
 *          **Replacement**: Consider two strings, such as bale and pale, that are one replacement away.
 *          Yes, that does mean that you could replace a character in bale to make pale.
 *          But more precisely, --it means that they are different only in one place.--
 *
 *          **Insertion**: The strings apple and aple are one insertion away.
 *          This means that if you compared the strings, they would be identical-except for a shift at some point in the strings.
 *
 *          **Removal**: The strings apple and aple are also one removal away, since removal is just the inverse of insertion
 */
public class OneWay {

    /*
    * This algorithm (and almost any reasonable algorithm) takes 0 (n) time, where n is the length of the shorter string
    * */
    public boolean isOneWayEdit(String first, String second) {

        /*
        * Observe that you don't need to check the strings for insertion, removal, and replacement edits.
        * The lengths of the strings will indicate which of these you need to check
        * */
        if (first.length() == second.length()) {
            return OneEditReplace(first, second);
        } else if (first.length() + 1 == second.length()) {
            return OneEditInsert(first, second);
        } else if (first.length() - 1 == second.length()) {
            return OneEditInsert(second, first);
        }
        return false;
    }

    private boolean OneEditReplace(String first, String second) {
        for (int i = 0; i < first.length(); i++) {
            boolean isMoreOneEdited = false;
            if (first.charAt(i) != second.charAt(i)) {
                if (isMoreOneEdited) {
                    return false;
                }
                isMoreOneEdited = true;
            }
        }
        return true;
    }

    /*Check if you can insert a a character into s1 to make s2*/
    private boolean OneEditInsert(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;

        while(index2 < s2.length() && index1 < s1.length()) {
            if(s1.charAt(index1) != s2.charAt(index2)){
                if(index1 != index2) {
                    return false;
                }
                index2++;
            }else {
                index1++;
                index2++;
            }
        }
        return true;
    }
}
