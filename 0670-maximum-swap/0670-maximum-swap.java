class Solution {
    public int maximumSwap(int num) {
        char[] numArray = Integer.toString(num).toCharArray();
        int[] lastIndex = new int[10];
        
        for (int i = 0; i < numArray.length; i++) {
            lastIndex[numArray[i] - '0'] = i;
        }

        for (int i = 0; i < numArray.length; i++) {
            for (int d = 9; d > numArray[i] - '0'; d--) {
                if (lastIndex[d] > i) {
                    char temp = numArray[i];
                    numArray[i] = numArray[lastIndex[d]];
                    numArray[lastIndex[d]] = temp;
                    return Integer.parseInt(new String(numArray));
                }
            }
        }
        return num;
    }
}
