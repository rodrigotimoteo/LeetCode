class Solution50 {
    public double myPow(double x, int n) {
        if(n == 0 || x == 1) return 1;
        if(x == 0) return 0;

        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1.0;
        double currentProduct = x;
        
        for (long i = N; i > 0; i /= 2) {
            if (i % 2 == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
        }

        return result;
    }
}