package datastrucutres.queue;

public class Main {

    public static void main(String[] args){

        Queue myQueue = new Queue(10);

//        myQueue.getFirst();
//        myQueue.getLast();
//        myQueue.getLength();

        myQueue.enqueue(20);
        myQueue.enqueue(30);
//        myQueue.enqueue(40);
//        myQueue.enqueue(50);

        myQueue.printQueue();
        System.out.println();

        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue());
    }
}
