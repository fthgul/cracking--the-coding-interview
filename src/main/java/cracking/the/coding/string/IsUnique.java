package cracking.the.coding.string;

/**
 * Question: Is Unique: Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 *
 *                                                            ==ASCII code's ==
 *              a,   b,  c,   d,   e,   f,   g,   h,   i,   j,   k,   l,   m,   n,   o,   p,   q,   r,   s,   t,   u,   v,   w,   x,   y,  z
 *   uppercase 65, 66, 67,  68,  69,  70,  71,  72,  73,  74,  75,  76,  77,  78,  79,  80,  81,  82,  83,  84,  85,  86   87,  88,  89,  90
 *   lowercase  97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122
 *
 */
public class IsUnique {

    /*
    *  Time Complexity O(n), where where n is the length of the string.
    *  Space Complexity O(1)
    *
    * (You could also argue the time complexity is O( 1),
     * since the for loop will never iterate through more than 128 characters.}
    *
    * */
    public boolean isUniqueString(String strValue) {
        //assume only english words
        if (strValue.length() > 128) {
            return false;
        }

        boolean[] uniqueArray = new boolean[128];

        for (int i = 0; i < strValue.length(); i++) {
            //get the (char) int value
            int value = strValue.charAt(i);

            //check for array
            if (uniqueArray[value]) {
                return false;
            } else {
                uniqueArray[value] = true;
            }

        }
        return true;
    }
}
