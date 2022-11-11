//Program with return type as int for adding two numbers
public class subprograms {

    public static void main(String[] args) { //main function
        int a=5, b=6,answer; //initializing inside main function
     
        answer= myMethod(a,b); // calling the function
    System.out.println(answer); // 11
        
        
    }

    private static int myMethod(int x, int y) {   //subprogram
      int c;
      c=x+y;  // Calculating the sum of two integers
    
      return c;   //return type is int because adding integers 
      
    }
    
}
