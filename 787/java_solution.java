import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class Solution787 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        //Graph holds adjacency list
        Map<Integer, List<int[]>> graph = new HashMap<>();

        for(int[] flight : flights) {
            int fromI = flight[0];
            int toI = flight[1];
            int costI = flight[2];
            graph.computeIfAbsent(fromI, key -> new ArrayList<>()).add(new int[]{toI, costI});
        }

        //Creates array to store costs
        int visited[] = new int[n];
        Arrays.fill(visited, Integer.MAX_VALUE);
        visited[src] = 0;

        //Queue for BFS
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{src, 0});

        int steps = 0;
        while (queue.size() != 0 && steps <= k) {
            int size = queue.size();
            
            for(int i = 0; i < size; i++) {
                int[] currentNode = queue.poll();
                int currentTo = currentNode[0];
                int currentPrice = currentNode[1];

                if (currentTo == dst) continue;

                for (int[] neighbor : graph.getOrDefault(currentTo, new ArrayList<>())) {
                    int nextNode = neighbor[0];
                    int cost = neighbor[1];

                    int totalCost = currentPrice + cost;

                    if (totalCost < visited[nextNode]) {
                        visited[nextNode] = totalCost;
                        queue.offer(new int[]{nextNode, totalCost});
                    }                
                }
            } 

            steps++;    
        }

        return visited[dst] == Integer.MAX_VALUE ? -1 : visited[dst]; 
    }
}