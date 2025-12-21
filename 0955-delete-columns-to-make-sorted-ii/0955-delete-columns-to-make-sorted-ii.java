class Solution {
    public int minDeletionSize(String[] strs) {
        int rows = strs.length;
        int cols = strs[0].length();
        boolean[] check = new boolean[rows-1];
        int count=0;
        for(int i=0;i<cols;i++){
            boolean bad = false;
            for(int j=0;j<rows-1;j++){
                if(!check[j] && (int)strs[j].charAt(i)>(int)strs[j+1].charAt(i)){
                    bad = true;
                    break;
                }
            }
            if(bad){
                count++;
            }
            else{
                for(int j=0;j<rows-1;j++){
                    if(!check[j] && strs[j].charAt(i)<strs[j+1].charAt(i)){
                        check[j] = true;
                    }
                }
            }
        }
        return count;
    }
}