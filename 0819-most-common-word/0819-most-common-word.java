class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z]", " ");

        String[] words = paragraph.split("\\s+");

        HashSet<String> ban = new HashSet<>();

        for (String word : banned) {
            ban.add(word);
        }

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty() && !ban.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        String ans = "";
        int max = 0;

        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                ans = key;
            }
        }

        return ans;
    }
}