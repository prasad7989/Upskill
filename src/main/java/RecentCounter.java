import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<Integer>();
    }

    public int ping(int t) {
        //looping till queue is empty 
        while (!queue.isEmpty() && t - queue.peek() > 3000) {
            queue.remove();
        }

        queue.add(t);

        return queue.size();
    }
}