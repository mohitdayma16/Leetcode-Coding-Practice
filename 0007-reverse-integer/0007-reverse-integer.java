class Solution {
    public int reverse(int x) {
        int temp=Math.abs(x);
        int rev =0;
        while(temp!=0){
            int digit = temp%10;

            if(rev>(Integer.MAX_VALUE - digit)/10){
                return 0;
            }

            rev = rev*10+ digit;
            temp = temp/10;
        }

        return (x>0) ? rev:-rev;
    }
}