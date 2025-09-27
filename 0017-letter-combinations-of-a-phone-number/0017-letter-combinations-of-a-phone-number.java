class Solution {
    static String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static List<String> combination(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            if (!p.isEmpty()) list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        String letters = mapping[digit];

        List<String> list = new ArrayList<>();
        for (char ch : letters.toCharArray()) {
            list.addAll(combination(p + ch, up.substring(1)));
        }
        return list;
    }

    public List<String> letterCombinations(String digits) {
        return combination("", digits);
    }
}
