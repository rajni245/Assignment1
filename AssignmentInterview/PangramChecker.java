public class PangramChecker {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";  // Example sentence
        boolean isPangram = checkPangram(sentence);

        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean checkPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        int index = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if ('A' <= sentence.charAt(i) && sentence.charAt(i) <= 'Z') {
                index = sentence.charAt(i) - 'A';
            } else if ('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z') {
                index = sentence.charAt(i) - 'a';
            }
            alphabet[index] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                return false;
            }
        }
        return true;
    }
}
