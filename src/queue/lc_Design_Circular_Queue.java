package queue;
class MyCircularQueue {
    // Variables
    private int[] queue;
    private int headIndex;
    private int queueCapacity;
    private int queueCount;

    public MyCircularQueue(int k) {
        this.queueCapacity = k;
        this.queue = new int[k];
        this.headIndex = 0;
        this.queueCount = 0;
    }

    // Insert an element into the queue
    // returns true if the operation is successful
    public boolean enQueue(int value) {
        if (this.queueCount == this.queueCapacity) {
            return false;
        }
        this.queue[(this.headIndex + this.queueCount -1) % queueCapacity] = value;
        this.queueCount++;
        return true;
    }

    public boolean deQueue() {
        if (this.queueCount == 0) return false;
        this.headIndex = (this.headIndex + 1) % this.queueCapacity;
        this.queueCount--;
        return true;
    }

    public int getItemFront() {
        if (this.queueCount == 0) return -1;
        return this.queue[this.headIndex];
    }

    public int getItemRear() {
        if (this.queueCount == 0) return -1;
        int tailIndex = (this.headIndex + this.queueCount -1) % this.queueCapacity;
        return this.queue[tailIndex];
    }

    public boolean isEmpty(){
        return (this.queueCount == 0);
    }

    public boolean isFull(){
        return (this.queueCapacity == this.queueCount);
    }

}
public class lc_Design_Circular_Queue {
    public static void main(String[] args) {

    }
}
