import java.util.*;

public class Runner
{
   public static void min(String[] args)
   {
      StackProbs sP = new StackProbs();
      
      Stack<Integer> doubleStack = new Stack<> (makeStack(new int[] {1, 3, 5, 0, -1}));
      System.out.println(sP.doubleUp(doubleStack));
      
      Stack<Integer> posAndNegStack = new Stack<> (makeStack(new int[] {2, 9, -4, 3, -1, 0, -6}));
      System.out.println(sP.posAndNeg(posAndNegStack));
   } 
   
  public static Stack<Integer> makeStack(int[] nums) 
  {
      Stack<Integer> stack = new Stack<>();
      for (int num : nums)
         stack.push(num);
      return stack;
   }
      
}