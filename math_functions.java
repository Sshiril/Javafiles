class Main {
  public static void main(String[] args) {
 
      double x = 9.0, y = 16.0, z;

      z = Math.sqrt(36.0);	// sqrt returns 6.0 (gets stored in z)
      System.out.printf("z = %.1f\n", z);
    //System.out.println("z =" + z);

      z = Math.sqrt(x);		// sqrt returns 3.0 (gets stored in z)
      System.out.printf("z = %.1f\n", z);

      z = Math.sqrt(x + y);	// sqrt returns 5.0 (gets stored in z) 
      System.out.printf("z = %.1f\n", z);

      // sqrt returns 10.0, which gets printed
      System.out.printf("Square root of 100: %.1f\n", Math.sqrt(100.0));

      // because of automatic type conversion rules we can send an int where a 
      //  double is expected.  This call returns 7.0
      System.out.printf("Math.sqrt(49) returns %.1f\n", Math.sqrt(49));

      // in this last one, sqrt(625.0) returns 25.0, which gets sent as the
      //  argument to the outer sqrt call.  This one returns 5.0, which gets
      //  printed
      System.out.printf("Math.sqrt(Math.sqrt(625.0)) = %.1f\n", 
              Math.sqrt(Math.sqrt(625.0)) );

    
  }
}
