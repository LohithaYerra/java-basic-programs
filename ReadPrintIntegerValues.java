import java.util.Scanner; //Scanner class to read the input from user

public class ReadPrintIntegerValues {
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in); //Creating an object for the Scanner Class.
     System.out.println("Enter an Integer value: ");
     int num = sc.nextInt(); //nextInt() method is used to read the Integer value from the user using Scanner object sc.
     System.out.println("Integer value = " +num); // To print the Integer Value.
  }
}
