import java.util.*;

public class WordLadder {

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            // Process all words at current level
            for (int i = 0; i < size; i++) {
                String word = queue.poll();

                // Try changing each letter
                for (int j = 0; j < word.length(); j++) {
                    char[] chars = word.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[j] = c;
                        String newWord = new String(chars);

                        if (newWord.equals(endWord)) return level + 1;

                        if (wordSet.contains(newWord)) {
                            queue.add(newWord);
                            wordSet.remove(newWord); // avoid revisiting
                        }
                    }
                }
            }
            level++;
        }

        return 0; // no transformation found
    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");

        int result = ladderLength(beginWord, endWord, wordList);
        System.out.println("Shortest transformation length: " + result);
    }
}
