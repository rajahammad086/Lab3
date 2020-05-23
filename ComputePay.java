//Raja Hammad Mehmood
// We'll be making a program which takes hours worked and hourly pay as an input adn prints the pay out
import java.util.Scanner;

public class ComputePay {

  public static void main ( String[] args ) {
    Scanner scanner = new Scanner(System.in);
    double hw;// It's the hours worked by the person
    double hr;// This is the hourly rate of the job
    System.out.println("Please type the hours worked");
    hw=scanner.nextDouble();
    System.out.println("Please input the hourly rate");
    hr=scanner.nextDouble();
    double pay;
    if (hw<=40) {
        pay=hr*hw;
    } else {
        pay=(40*hr)+((hw-40)*(hr+(hr/2)));
    }
 System.out.println("here's the pay :"+pay);// printing out the pay
  }
  
}