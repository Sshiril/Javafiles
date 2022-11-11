//Program with return type as void for adding two numbers.
public class subprograms {

    public static void main(String[] args) { //main function
        int a=5, b=6; //initializing inside main function
     
        myMethod(a,b); // calling the function
    
        
        
    }

    private static void myMethod(int x, int y) {   //subprogram
      int c;
      c=x+y;  // Calculating the sum of two integers
    
      System.out.println(c);  // printing sum   //returning nothing that's why void return type
      
    }
    
}
