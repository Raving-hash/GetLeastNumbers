import java.util.PriorityQueue;
import java.util.Queue;

public class Solution2 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length == 0 || k == 0){
            return new int[0];
        }
        Queue<Integer> queue = new PriorityQueue<>((v1,v2) -> v2 - v1);
        for(int i:arr){
            if (queue.size() < k){
                queue.offer(i);
            }else if(i < queue.peek()){
                queue.poll();
                queue.offer(i);
            }
        }

        int[] res = new int[k];
        int index = 0;
        for (int i: queue){
            res[index++] = i;
        }
        return res;

    }
}
