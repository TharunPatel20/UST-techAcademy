package stringMatchingAlgorithms;

public class NaiveSearch {

	public boolean findSecret(String innocent_text, String message_To_Find) {
		
		int n = innocent_text.length();
        int m = message_To_Find.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (innocent_text.charAt(i + j) != message_To_Find.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                System.out.println("Using NaiveSearch, Message found at position: " + i);
                return true;
            }
        }
        return false;
    }
}
