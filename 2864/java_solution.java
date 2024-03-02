class Solution2864 {
    public String maximumOddBinaryNumber(String s) {
        char[] array = s.toCharArray();

        int numOf1s = 0, numOf0s = 0;

        for(char num : array) 
            if(num == '1') numOf1s++;
        
        numOf0s = array.length - numOf1s;

        s = "";

        for(int i = 0; i < numOf1s - 1; i++)
            s += "1";

        for(int i = 0; i < numOf0s; i++)
            s += "0";

        s += "1";

        return s;
    }
}