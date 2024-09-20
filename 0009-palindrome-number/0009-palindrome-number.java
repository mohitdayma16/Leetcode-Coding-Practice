class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long n = 0;
        long temp =x;
        while(temp !=0){
            int digit = (int)(temp%10);
            n = n*10+digit;
            temp/=10;
        }
        if(n == x){
            return true;
        }
        return false;
    }
}