import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {



    Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<Integer>();
    }




    public int ping(int t) {

//Add t to queue

        queue.add(t);

//return current time to 3000 millisecond ago

        while (queue.peek() < t - 3000)

            queue.poll();

        return queue.size();

    }



}


/*

class RecentCounterTest {
    RecentCounter obj = new RecentCounter();
    // Fetches the number of calls
    System.out.println("number of calls    "+obj.ping(100));
}*/
