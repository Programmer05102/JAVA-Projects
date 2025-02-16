public class CircularQueueInsertionExample {

    private static final int MAXSIZE = 5; // Maximum size of the circular queue
    private int[] queue; // Array to store the elements
    private int front; // Index of the front element
    private int rear; // Index of the rear element
    private int count; // Number of values in the queue

    public CircularQueueInsertionExample() {
        queue = new int[MAXSIZE];
        front = 0;
        rear = 0;
        count = 0;
    }

    public void enqueue(int item) {
        if (count == MAXSIZE) {
            System.out.println("Overflow"); // Queue is already full
            return;
        }

        if (count == 0) {
            front = 0;
            rear = 0;
        } else if (rear == MAXSIZE - 1) {
            rear = 0;
        } else {
            rear++;
        }

        queue[rear] = item; // Insert the new element
        count++;
    }

    public void displayQueue() {
        System.out.print("Queue: ");
        if (count == 0) {
            System.out.println("Empty");
            return;
        }

        if (front <= rear) {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        } else {
            for (int i = front; i < MAXSIZE; i++) {
                System.out.print(queue[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueueInsertionExample queue = new CircularQueueInsertionExample();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6); // Overflow

        queue.displayQueue(); // Queue: 1 2 3 4 5
    }
}
