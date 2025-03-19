import java.util.Stack;

class QueueUsingStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public QueueUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int item) {
        stack1.push(item);
    }

    public void dequeue() {
        int size = stack1.size();
        while(size > 1){
            stack2.push(stack1.pop());
            size--;
        }

        System.out.println("\nElement Deque : " + stack1.pop());

        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public void display(){
        System.out.println(stack1.toString());
    }
}

public class Queue{
    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.dequeue();

        queue.display();
    }
}


