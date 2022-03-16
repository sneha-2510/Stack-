// Q1. To push an element at the bottom of a stack.

import java.util.*;

public class problem1{
   
   public static void pushAtBottom(Stack<Integer> s, int data){
    
    if(s.isEmpty){
    s.push(data);
    return;
    }
  
  int temp = s.pop();
  pushAtBottom(s,data);
  s.push(temp);
  }
     
public static void main(String[] args){
  Stack<Integer> s = new Stack<Integer>();
  s.push(1);
  s.push(2);
  s.push(3);
  
  s.pushAtBottom(s, 4);
  
  while(!s.isEmpty()){
  System.out.println(s.pop());
  
  }
 }
}
