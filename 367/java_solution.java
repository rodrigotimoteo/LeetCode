class Solution367 {
    public boolean isPerfectSquare(int num) {
        int temp = 1;

        while(true) {
            int calc = temp * temp;

            if(calc == num) return true;
            else if(calc < 0 || calc > num) return false;
            else temp++;
        }
    }
}