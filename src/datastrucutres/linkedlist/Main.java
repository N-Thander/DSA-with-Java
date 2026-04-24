package datastrucutres.linkedlist;

public class Main {
    public static void main(String[] args){
        LinkedList newLinkedList  = new LinkedList(10);

//        newLinkedList.getHead();
//        newLinkedList.getTail();
//        newLinkedList.getLength();
//        newLinkedList.printList();

        newLinkedList.append(20);
        newLinkedList.append(30);
        newLinkedList.append(40);
        newLinkedList.append(50);

        newLinkedList.printList();

//        System.out.println(newLinkedList.removeLast().value);
//        System.out.println(newLinkedList.removeLast().value);
//        System.out.println(newLinkedList.removeLast());

//        newLinkedList.prepend(0);

//        System.out.println(newLinkedList.removeFirst().value);
//        System.out.println(newLinkedList.removeFirst().value);
//        System.out.println(newLinkedList.removeFirst());

//        System.out.println(newLinkedList.get(2));
//        System.out.println(newLinkedList.get(2).value);

//        newLinkedList.set(2, 100);
//        newLinkedList.printList();

//        newLinkedList.insert(3, 100);
//        newLinkedList.printList();

//        newLinkedList.remove(3);
//        newLinkedList.printList();

        newLinkedList.reverse();
        newLinkedList.printList();
    }
}
