package cracking.the.coding.string;

/**
 * Created by lenova on 08/12/2019.
 */
public class Compress {

    public String doCompress(String s) {
        int compressedLength = processCompress(s);
        if(compressedLength < s.length()) {
            StringBuilder compressedValue = new StringBuilder(compressedLength);
            int compressedCount = 0;

            for (int i = 0; i < s.length(); i++) {
                compressedCount++;
                if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                    compressedValue.append(s.charAt(i));
                    compressedValue.append(compressedCount);
                    compressedCount = 0;
                }
            }

            System.out.println(compressedValue.toString());
            return compressedValue.toString();
        }


        System.out.println(s);
        return s;
    }

    private int processCompress(String s) {
        int compressedLength = 0;
        int compressedCount
                = 0;

        for (int i = 0; i < s.length(); i++) {
            compressedCount++;

            /*if next character is different from than current increase the length*/
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                compressedLength += 1 + String.valueOf(compressedCount).length();
                compressedCount = 0;
            }
        }

        return compressedLength;
    }
}
