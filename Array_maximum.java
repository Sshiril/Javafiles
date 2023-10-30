//Program to find the maximum number in an array.
class Main {
  public static void main(String[] args) {

    int i; 
     int arr[] = {10, 324, 45, 90, 9808}; 
    // Initialize maximum element 
    int max = arr[0]; 

    // Traverse array elements from second and 
    // compare every element with current max 
    for (i = 1; i < arr.length; i++) {
        if (arr[i] > max) 
            max = arr[i]; 

    }
    System.out.println("max: " + max);

    
  }
}
