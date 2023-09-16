import java.util.*;

public class StackProbs 
{
   public Stack<Integer> doubleUp(Stack<Integer> nums)
      {
         Stack<Integer> temp = new Stack<>();
         while(! nums.isEmpty())
            {
               int n = nums.pop();
               temp.push(n);
               temp.push(n);
            }
         while(! temp.isEmpty())
            {
               int n = temp.pop();
               nums.push(n);
            }
         
         return nums;
      }
      
    public Stack<Integer> posAndNeg(Stack<Integer> nums)
      {
         Stack<Integer> posStack = new Stack<>();
         Stack<Integer> negStack = new Stack<>();
         Stack<Integer> zeroStack = new Stack<>();

         
         while(! nums.isEmpty())
            {
               int n = nums.pop();
               if(n > 0)
                  {
                     posStack.push(n);
                  }
               else if(n == 0)
                  {
                    zeroStack.push(n);
                  }
               else
                  {
                     negStack.push(n);
                  }         
            }
            
         while(! negStack.isEmpty())
            {
               int n = negStack.pop();
               nums.push(n);
            }
            
         while(! zeroStack.isEmpty())
            {
               int n = zeroStack.pop();
               nums.push(n);
            }
            
          while(! posStack.isEmpty())
            {
               int n = posStack.pop();
               nums.push(n);
            }
            
        return nums;
      } 
      
   public Stack<Integer> shiftByN(Stack<Integer> nums, int n)
      {
         Stack<Integer> temp = new Stack<>();
         Stack<Integer> topOfStack = new Stack<>();
         Stack<Integer> reverseTemp = new Stack<>();
         Stack<Integer> reverseOfTop = new Stack<>();



         
          while(! nums.isEmpty())
            {
               int num = nums.pop();
               temp.push(num);
            }
            
            for(int i = 0; i < n; i++)
               {
                  int num = temp.pop();
                  topOfStack.push(num);
               }
               
            while(! topOfStack.isEmpty())
               {
                  int num = topOfStack.pop();
                  reverseOfTop.push(num);
               }
                 
            while(! temp.isEmpty())
               {
                  int num = temp.pop();
                  reverseTemp.push(num);
               }
               
               
             while(! reverseOfTop.isEmpty())
               {
                  int num = reverseOfTop.pop();
                  reverseTemp.push(num);
               }     
                                 
            return reverseTemp;
      }
      
   public String reverseVowels(String str)
      {
         Stack<Character> vowelsOrder = new Stack<>(); 
 
         
         for(int i = 0; i < str.length(); i++)
            {
               if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                  {
                     vowelsOrder.push(str.charAt(i));
                  }
            }
            
        String reverse = "";
         
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                     {
                        reverse += vowelsOrder.pop();
                     }
                  
          else 
            {
               reverse += str.charAt(i);
            }
        }
 
        return reverse;   
         
   }
   public boolean bracketBalance(String s)
      {
         Stack<Character> brackets = new Stack<>();
         
         for(int i = 0; i < s.length(); i++)
            {
               if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                  {
                     brackets.push(s.charAt(i));
                  }
            }
        
        for(int i = 0; i < s.length(); i++)
           {
              if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')
                  {
                  
                  try 
                     {
                        brackets.pop();
                     }
                  catch (EmptyStackException e)
                     {
                        return false;
                     }
                     
                  } 
           }
           
         if (brackets.isEmpty())
            {
               return true;
            } 
         else
         {
            return false;
         }
            
      }
      
} 