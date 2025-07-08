
import java.util.*;
class StackAL {
    // Stack implementation using ArrayList
    // Time Complexity for push, pop, peek: O(1)
    // Space Complexity: O(n)
    
    // Using ArrayList to implement stack
    // ArrayList is a resizable array implementation of the List interface
    // It provides dynamic array capabilities and allows for efficient element access.
    
   ArrayList<Integer> list = new ArrayList<>();
    
    public void push(int data){
        list.add(data);
    }
    public  boolean isEmpty(){
        return list.size()==0;
    }
    public  int pop(){
        if(isEmpty()){
            return -1;
        }
        int top =list.remove(list.size()-1);
        return top;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        int top =list.get(list.size()-1);
        return top;
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
        
    }
}
















