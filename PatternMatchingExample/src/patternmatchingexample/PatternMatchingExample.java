public class PatternMatchingExample {

    public static int patternMatch(String T, String P) {
        int S = T.length();
        int R = P.length();
        int K = 1;
        int MAX = S - R + 1;
        int INDEX = 0;

        while (K <= MAX) {
            boolean match = true;
            for (int L = 1; L <= R; L++) {
                if (P.charAt(L - 1) != T.charAt(K + L - 2)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                INDEX = K;
                return INDEX; // Success: Pattern found at INDEX
            }

            K++;
        }

        INDEX = 0;
        return INDEX; // Failure: Pattern not found
    }

    public static void main(String[] args) {
        String T = "This is a test string";
        String P = "test";

        int index = patternMatch(T, P);

        if (index != 0) {
            System.out.println("Pattern found at index: " + index);
        } else {
            System.out.println("Pattern not found");
        }
    }
}
