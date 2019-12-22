package cracking.the.coding.string;

/**
 * URLify: Write a method to replace all spaces in a string with '%20'
 *
 * EXAMPLE Input: "Mr John Smith JJ    ", 13
 *        Output: "Mr%2eJohn%2eSmith"
 */
public class URLify {

    /*
    * A common approach in string manipulation problems is to edit the string starting from the end and working backwards.
    * This is useful because we have an extra buffer at the end,
    * which allows us to change characters without worrying about what we're overwriting
    *
    *
    *  The algorithm employs a two-scan approach. In the first scan, we count the number of spaces.
    *  By tripling this number, we can compute how many extra characters we will have in the final string.
    *  In the second pass, which is done in reverse order, we actually edit the string.
    *  When we see a space, we replace it with %20. If there is no space, then we copy the original character.
    *
    * */

    public String replaceSpaces(String strValue) {
        if(strValue == null)
            return "";

        int spaceCount = 0;
        int index = 0;
        char[] chars = strValue.trim().toCharArray();


        for (char aChar : chars) {
            if( aChar == ' ') {
                spaceCount++;
            }
        }

        index = chars.length + spaceCount*2;
        char[] newChars = new char[index];

        for(int i = chars.length-1; i>=0; i--) {
            if(chars[i] == ' ') {
                newChars[index -1] = '0';
                newChars[index -2] = '2';
                newChars[index -3] = '%';
                index -= 3;
            }else {
                newChars[index -1]= chars[i];
                index -=1;
            }
        }

        System.out.println(String.valueOf(newChars));
        return  String.valueOf(newChars);
    }

    //Solution #2
    public String getURlify(String actualValue) {
        String trimString = actualValue.trim();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < trimString.length(); i++) {
            if(Character.isWhitespace(trimString.charAt(i))) {
                sb.append("%20");
                continue;
            }else {
                sb.append(trimString.charAt(i));
            }
        }

        return sb.toString();
    }
}
