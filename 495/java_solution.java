class Solution495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(duration == 0) {
            return 0;            
        }
        int count = 0;
        for(int i = 0; i < timeSeries.length; i++) {
            if(i != timeSeries.length - 1 && timeSeries[i] + duration >= timeSeries[i + 1]) {
                count += timeSeries[i + 1] - timeSeries[i]; 
            } else {
                count += duration;
            }
        }
        return count;
    }
}