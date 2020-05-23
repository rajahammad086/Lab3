//Raja Hammad Mehmood
// We'll be taking 3 values and printing out the highest one
import java.util.Scanner;

public class MaxInt {
  public static void main ( String[] args ) {
    Scanner scanner = new Scanner(System.in);
    int firstvalue;// It's the first integer value
    int secondvalue;// This is the second integer value
    int thirdvalue;// Third integer value
    System.out.println("Please type the first integer value");
    firstvalue=scanner.nextInt();
    System.out.println("Please type the second integer value");
    secondvalue=scanner.nextInt();
    System.out.println("Please type the third integer value");
    thirdvalue=scanner.nextInt();
    if (firstvalue>secondvalue) {
      if (firstvalue>thirdvalue){
        System.out.println("highest value is "+firstvalue);
      } else {
       System.out.println("highest value is "+thirdvalue);
      }
    }  
    else if (secondvalue>thirdvalue) {
      System.out.println("highest value is "+secondvalue);
    }
  else {
    System.out.println("highest value is "+thirdvalue);
  }
  }
  
}