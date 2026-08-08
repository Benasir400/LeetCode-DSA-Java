class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int[] suf = new int[n + 1];
        Arrays.fill(suf, m);

        int j = m - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
                j--;
            }
            suf[i] = j + 1;
        }

        List<Integer> ans = new ArrayList<>();
        boolean usedMismatch = false;

        j = 0;

        for (int i = 0; i < n && j < m; i++) {
            if (word1.charAt(i) == word2.charAt(j)) {
                ans.add(i);
                j++;
            } 
            else if (!usedMismatch && suf[i + 1] <= j + 1) {
                ans.add(i);
                usedMismatch = true;
                j++;
            }
        }

        if (j < m) {
            return new int[0];
        }

        int[] res = new int[m];

        for (int k = 0; k < m; k++) {
            res[k] = ans.get(k);
        }

        return res;
    }
}