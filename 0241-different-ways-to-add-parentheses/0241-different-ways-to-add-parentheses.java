public class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < expression.length(); i++) {
            
            char c = expression.charAt(i);

            if (c == '+' || c == '-' || c == '*') {
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
                for (int l : left) {
                    for (int r : right) {
                        if (c == '+') {
                            results.add(l + r);
                        } else if (c == '-') {
                            results.add(l - r);
                        } else if (c == '*') {
                            results.add(l * r);
                        }
                    }
                }
            }
        }
        if (results.isEmpty()) {
            results.add(Integer.parseInt(expression));
        }

        return results;
    }
}