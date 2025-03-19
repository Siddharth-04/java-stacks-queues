class Stack{
    int [] arr;
    int size;
    int index;

    public Stack(int size) {
        this.arr = new int [size];
        this.size = 0;
        this.index = 0;
    }

    public void push(int x) {
        if(index==size-1){
            size = size*2;
        }
        arr[index++] = x;
    }

    public int pop() {
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }

        return arr[--index];
    }

    public int peek() {
        return arr[index-1];
    }

    public boolean isEmpty(){
        if(this.index == 0){
            return true;
        }
        return false;
    }

}

public class SortStack {
    public static void addElementInSortedStack(Stack s1,int element){
        if(s1.isEmpty() || element <= s1.peek()){
            s1.push(element);
            return;
        }

        int top = s1.pop();
        addElementInSortedStack(s1,element);
        s1.push(top);

    }
    public static void sortStack(Stack s1) {
        if(s1.isEmpty()){
            return;
        }

        int topElement = s1.pop();
        sortStack(s1);
        addElementInSortedStack(s1,topElement);

    }

    public static void main(String[] args) {
        Stack s1 = new Stack(10);
        s1.push(4);
        s1.push(5);
        s1.push(3);
        s1.push(1);
        s1.push(2);


        sortStack(s1);
        while(!s1.isEmpty()){
            System.out.println(s1.pop() + " ");
        }
    }
}
