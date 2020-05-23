//Raja Hammad Mehmood
// We'll be taking orders from the user and print out the drink order.
import java.util.Scanner;

public class DrinkOrder {
  public static void main ( String[] args ) {
    Scanner scanner = new Scanner(System.in);
    String drink;// drink ordered by the user
    String type;//type of the drink
    type="nothing";
    System.out.println("Do you want water juice milk coffee or tea?");
    drink=scanner.nextLine();
    while (drink.equalsIgnoreCase("Juice")!=true && drink.equalsIgnoreCase("water")!=true && drink.equalsIgnoreCase("Milk")!=true && drink.equalsIgnoreCase("Coffee")!=true && drink.equalsIgnoreCase("tea")!=true){ //verification for drink
    System.out.println("I don't know that beverage.Do you want water, juice, milk, coffee or tea?");
    drink=scanner.nextLine();
    }
    if (drink.equalsIgnoreCase("Juice")) { // this is if user chooses juice
        System.out.println("Which one do you want: Orange, Apple or Grapes?");
        type=scanner.nextLine();
        while (type.equalsIgnoreCase("Orange")!=true && type.equalsIgnoreCase("Grapes")!=true && type.equalsIgnoreCase("Apple")!=true ){
        System.out.println("I don't know that kind of beverage.Do you want Orange, Grape or Apple??");
        type=scanner.nextLine();
    }
    }
    else if (drink.equalsIgnoreCase("milk")) {//if user chooses milk
        System.out.println("Which one do you want: Regular or Chocolate?");
        type=scanner.nextLine();
        while (type.equalsIgnoreCase("regular")!=true && type.equalsIgnoreCase("chocolate")!=true ){
        System.out.println("I don't know that kind of beverage.Do you want regular or chocolate??");
        type=scanner.nextLine();
    }
    }
     else if (drink.equalsIgnoreCase("coffee") || drink.equalsIgnoreCase("tea")) {//if user chooses coffee or tea
        System.out.println("Which one do you want: Regular or Decaf?");
        type=scanner.nextLine();
        while (type.equalsIgnoreCase("regular")!=true && type.equalsIgnoreCase("decaf")!=true ){
        System.out.println("I don't know that kind of beverage.Do you want regular or decaf??");
        type=scanner.nextLine();
         }
         
     }
     System.out.println("The beverage is "+ drink + " and the type is " + type);
    
    
   
    
    
  }
  
}