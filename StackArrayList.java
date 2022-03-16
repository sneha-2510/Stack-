//Stack implementation using ArrayList

import java.util.ArrayList;

public class StackArrayList {
    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        //push()
        public void push(int data) {
            list.add(data);
        }
        
        //isEmpty()
        public boolean isEmpty() {
            return list.size() == 0;
        }

        //pop()
        public int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek()
        public int peek() {
            if(isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]) {
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