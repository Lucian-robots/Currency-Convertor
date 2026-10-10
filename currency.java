//import scanner
import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        // scanner
       Scanner input = new Scanner(System.in);
       System.out.println("\nHello, Welcome to the Currency Convertor. Which Currency's would you like to convert? ");
       System.out.println("There is:\tUSD\tEUR\tYEN\t");
       
       //first currency
       System.out.println("First currency: ");
       String currency1 = input.nextLine();
       
       // second currency
       System.out.println("What will you second currency be: ");
       String currency2 = input.nextLine();

       System.out.println("So your currency's are: " + currency1 + "  and " + currency2); 

       System.out.println("Hello world!");

    } 
}