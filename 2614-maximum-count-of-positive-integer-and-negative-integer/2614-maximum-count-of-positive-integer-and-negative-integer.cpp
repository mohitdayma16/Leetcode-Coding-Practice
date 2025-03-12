class Solution {
public:
    int maximumCount(vector<int>& nums) {
        int c=0,p=0;
        for(auto i:nums){
            if(i>0){
                c++;
            }else if(i<0){
                p++;
            }else{
                continue;
            }
        }

        return max(c,p);
    }
};