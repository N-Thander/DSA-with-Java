package datastrucutres.doublylinkedlist;

public class Main {
    public static void main(String[] args){
        DoublyLinkedList myDLL = new DoublyLinkedList(10);

//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();
//        myDLL.printList();

        myDLL.append(20);
        myDLL.append(30);
        myDLL.append(40);
        myDLL.append(50);

        myDLL.printList();

//        System.out.print(myDLL.removeLast() + " ");
//        myDLL.getTail();
//        System.out.print(myDLL.removeLast() + " ");
//        myDLL.getTail();
//        System.out.print(myDLL.removeLast());

//        myDLL.prepend(0);
//        myDLL.printList();

//        System.out.println(myDLL.removeFirst());
//        myDLL.getHead();
//        myDLL.printList();
//        System.out.println(myDLL.removeFirst());
//        myDLL.getHead();
//        myDLL.printList();

//        System.out.println(myDLL.get(2).value);
//        System.out.println(myDLL.get(3).value);

//        myDLL.set(2, 10000);
//        myDLL.printList();

//        myDLL.insert(2, 1000);
//        myDLL.printList();

        myDLL.remove(2);
        myDLL.printList();
    }
}