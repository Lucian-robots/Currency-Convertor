//import scanner
import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        // scanner
       Scanner input = new Scanner(System.in);
       // currency exchange rates
       double USD = 0;
       double EUR = 0;
       double YEN = 0;

       System.out.println("\nHello, Welcome to the Currency Convertor. Which Currency's would you like to convert? ");
       System.out.println("There is:\tUSD\tEUR\tYEN\t");
       
       //first currency
       System.out.println("First currency: ");
       String currency1 = input.nextLine();
       
       // second currency
       System.out.println("What will you second currency be: ");
       String currency2 = input.nextLine();

       System.out.println("So your currency's are: " + currency1 + "  and " + currency2); 
       boolean correct = input.nextBoolean();
       // value of currency
       System.out.println("Enter how many " + currency1 + " you have: ");
       if ("USD".equals(currency1)) {
         USD = input.nextDouble();
       }
       else if (currency1 == "YEN") {
        YEN = input.nextDouble();
       }
       else {
        EUR = input.nextDouble();
       }
       
      
       if (currency1.equals("USD") && currency2.equals("YEN")) {
            //
            System.out.println("That is " + USD*158.89 + " YEN.");
       }
       else {
            //
            System.out.println("Invalid");
            

       }
       

       /*
       make currency convertor
       investment thingy
       math.random() for market changes

       */

    } 
}