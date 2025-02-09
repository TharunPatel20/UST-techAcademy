package stringMatchingAlgorithms;

public class BoyerMooreAlgorithm {
    public boolean findSecret(String innocent_text, String message_To_Find) {
        int m = message_To_Find.length();
        int n = innocent_text.length();

        if (m == 0 || n == 0 || m > n) return false;

        int[] badChar = preprocessBadCharacterShift(message_To_Find);

        int s = 0; // Shift of the pattern with respect to text
        while (s <= (n - m)) {
            int j = m - 1;

            // Start comparing from the end of the pattern
            while (j >= 0 && message_To_Find.charAt(j) == innocent_text.charAt(s + j)) {
                j--;
            }

            if (j < 0) {
                System.out.println("using BoyerMooreAlgorithm, Message found at position: " + s);
                return true; // Match found
            } else {
                s += Math.max(1, j - badChar[innocent_text.charAt(s + j)]);
            }
        }
        return false; // Match not found
    }

    private int[] preprocessBadCharacterShift(String pattern) {
        int[] badChar = new int[256];
        for (int i = 0; i < 256; i++) {
            badChar[i] = -1;
        }
        for (int i = 0; i < pattern.length(); i++) {
            badChar[pattern.charAt(i)] = i;
        }
        return badChar;
    }
}
