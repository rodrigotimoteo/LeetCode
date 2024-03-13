class Solution2485 {
    public int pivotInteger(int n) {
        int left = 0, right = 0;

        for(int i = 1; i <= n; i++) {
            left = (i * (i + 1)) / 2;
            right = ((i + n) * (n - i + 1)) / 2;

            if(left == right) return i;
        }

        return -1;
    }
}