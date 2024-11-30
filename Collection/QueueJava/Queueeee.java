// import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queueeee {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();

        q.add(40);  //throws an IllegalStateException upon failing to insert the element
        // q.offer(4);   //returns false upon failing to insert the element
        q.add(31);
        q.add(56);
        q.add(78);
        q.add(18);
        q.add(8);

        System.out.println(q);

        // Iterator<Integer> i = q.iterator();
        // while(i.hasNext()){
        //     System.out.print(i.next()+", ");
        // }
        // System.out.println("\b\b ");

        // System.out.println(q.isEmpty());
        // System.out.println(q.peek());
        // System.out.println(q.poll());
        // System.out.println(q.size());

        // System.out.println(q);

    }
}
/*
FIFO: First In First Out

Methods of Queue:
    1. add() - add element to the end of the Queue
    2. remove() - remove element from the front of the Queue (throws an exception if element not present)
    3. peek() - return the element at the front of the Queue
    4. poll() - rmeove the element at the front of the Queue (shows null if element not present)
    5. size() - return the number of elements in the Queue
    6. isEmpty() - return true if the Queue is empty
    7. clear() - remove all elements from the Queue
*/