package datastrucutres.stack;

public class Main {
    public static void main(String[] args){
        Stack myStack = new Stack(10);

//        myStack.getTop();
//        myStack.getHeight();

        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        myStack.printStack();
        System.out.println();

        myStack.pop();
        myStack.pop();

        myStack.printStack();


    }
}
