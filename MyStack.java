import java.util.*;
import java.util.Arrays;

public class MyStack
   {
      private Integer[] stack;
      private int size;
      
      public MyStack()
         {
            this.size = 0;
            this.stack = new Integer[5];
         }
      
      public MyStack(int initCap)
         {
            this.size = 0;
            this.stack = new Integer[initCap];
         }
         
      public boolean isEmpty()
         {
            if (size == 0)
               {
                  return true;
               }
            else
               {
                  return false;
               }
         }
         
       public Integer peek()
         {
            if (size == 0)
               {
                  throw new EmptyStackException();
               }
            else
               {
                  return stack[size-1];
               }
         }

       public Integer pop()
         {
            int popped = peek();
            size -= 1;
            return popped;
         }
       
       public void doubleCapacity()
         {
            Integer[] d = new Integer[stack.length * 2];
            for(int i = 0; i < stack.length; i++)
               {
                  d[i] = stack[i];
               }
            stack = d;
         }
       
      public void push(Integer item)
         {
            if(size == stack.length)
               {
                  doubleCapacity();
               }
            stack[size] = item;
            size++;
         }
      
     @Override 
     public String toString()
         {
            return "" + Arrays.toString(stack);
         }
}