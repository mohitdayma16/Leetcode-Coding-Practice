class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1;
        k--;
        
        while (k > 0) {
            int steps = countSteps(curr, n);
            
            if (steps <= k) {
                curr++;
                k -= steps;
            } else {
                curr *= 10;
                k--;
            }
        }
        
        return curr;
    }
    
    private int countSteps(int curr, int n) {
        long steps = 0;
        long first = curr;
        long last = curr;
        
        while (first <= n) {
            steps += Math.min(last, n) - first + 1;
            first *= 10;
            last = last * 10 + 9;
        }
        
        return (int) steps;
    }
}
