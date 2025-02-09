package stringMatchingAlgorithms;

public class KMPAlgorithm {
    public boolean findSecret(String innocent_text, String message_To_Find) {
        int[] lps = computeLPSArray(message_To_Find);
        int i = 0; // Index for text
        int j = 0; // Index for pattern

        while (i < innocent_text.length()) {
            if (message_To_Find.charAt(j) == innocent_text.charAt(i)) {
                i++;
                j++;
            }
            if (j == message_To_Find.length()) {
                System.out.println("Using KMPAlgorithm, Message found at position: " + (i - j));
                return true;
            } else if (i < innocent_text.length() && message_To_Find.charAt(j) != innocent_text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    private int[] computeLPSArray(String pattern) {
        int length = 0;
        int i = 1;
        int[] lps = new int[pattern.length()];
        lps[0] = 0;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}


