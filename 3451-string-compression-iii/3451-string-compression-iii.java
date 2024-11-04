class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int i = 0;

        while (i < word.length()) {
            char c = word.charAt(i);
            int count = 0;
            while (i < word.length() && word.charAt(i) == c && count < 9) {
                count++;
                i++;
            }
            comp.append(count).append(c);
        }

        return comp.toString();
    }
}
