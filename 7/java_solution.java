class Solution7 {
    public int reverse(int x) {
        boolean negative = x < 0;

        if(negative) x = -x;

        int num[] = new int[String.valueOf(Math.abs(x)).length()];

        for(int i = 0; i < num.length; i++) {
            num[i] = (int) (x / Math.pow(10, num.length - i - 1));

            x -= num[i] * Math.pow(10, num.length - i - 1);
        }

        for(int i = 0; i < num.length / 2; i++) {
            int temp = num[i];
            num[i] = num[num.length - i - 1];
            num[num.length - i - 1] = temp;
        }

        int number = 0;

        for(int i = 0; i < num.length; i++) {
            int tempNumber = number;

            number += num[i] * Math.pow(10, num.length - i - 1);
            
            if(tempNumber > number || number == 2147483647) return 0;
        }

        if(negative) return -number;
        else return number;
    }
}