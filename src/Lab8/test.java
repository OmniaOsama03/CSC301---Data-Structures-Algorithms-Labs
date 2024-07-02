package Lab8;

import java.util.LinkedList;
import java.util.Queue;

public class test {
    public static void main(String[] args) {
        // Create a FIFO queue using a LinkedList
        Queue<String> fifoQueue = new LinkedList<>();
        // Enqueue (add) 3 elements to the FIFO queue
        fifoQueue.add("Omnia");
        fifoQueue.add("Maadoum");
        fifoQueue.add("Aala");

        // Dequeue (remove) & print the first element from the FIFO queue
        String firstElement = fifoQueue.poll();
        System.out.println("Dequeued: " + firstElement);

        // Print elements in the FIFO queue after removing the first item
        System.out.println("Elements in the FIFO Queue after removing the first item:" + fifoQueue);

        // Check if the FIFO queue is empty
		boolean isFifoQueueEmpty = fifoQueue.isEmpty();
        System.out.println("Is FIFO Queue Empty: " + isFifoQueueEmpty);

        // Enqueue another item
        fifoQueue.add("Osama");

        // Print all elements in the FIFO queue after adding
        System.out.println("Elements in the FIFO Queue after adding new item: " + fifoQueue);

        // Peek at the first element without removing it
		String peekedElement = fifoQueue.peek();
        System.out.println("Peeked Element: " + peekedElement);
    }
}

