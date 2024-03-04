import java.util.Arrays;

class Solution948 {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0, maxScore = 0;

        Arrays.sort(tokens);

        int left = 0, right = tokens.length - 1;

        while(left <= right) {
            if(tokens[left] <= power) {
                power -= tokens[left];
                left++;

                score++;

                maxScore = Math.max(score, maxScore);
            } else if (score > 0) {
                power += tokens[right];
                right--;

                score--;
            } else 
                break;
        }

        return maxScore;
    }
}