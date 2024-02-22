class Solution997 {
    public int findJudge(int n, int[][] trust) {
        int people[] = new int[n];

        int possibleJudge = 0;
        int peopleTrusting = 0;

        for(int i = 0; i < trust.length; i++) 
            people[trust[i][0] - 1] = trust[i][0];

        for(int i = 0; i < n; i++) {
            if(people[i] == 0) {
                possibleJudge = i + 1;
                break;
            }
        }

        if(possibleJudge == 0) return -1;

        for(int i = 0; i < trust.length; i++) {
            if(trust[i][1] == possibleJudge) peopleTrusting++;
        }

        if(peopleTrusting == (n - 1)) return possibleJudge;

        return -1;
    }
}