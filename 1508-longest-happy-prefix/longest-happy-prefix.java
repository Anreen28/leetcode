class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        int[] arr = new int[n];
        int j = 0;
        for (int i = 1; i < n; i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = arr[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            arr[i] = j;
        }
        int length = arr[n - 1];
        return s.substring(0, length);
    }
}
