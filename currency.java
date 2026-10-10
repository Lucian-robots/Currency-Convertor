//import scanner
import java.util.Scanner;

public class currency {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // convertor();
        // investment();
        System.out.println("\nWhat would you like to do? \n1. currencyConvertor (enter: currencyConvertor) \t 2. Invest your money (enter: Invest)");
        String choice = scanner.nextLine();
        if (choice.equals("currencyConvertor")) {
            convertor();
        }
        else if (choice.equals("Invest")) {
            investment();

        }
        else {
            System.out.println("Invalid input. ");
        }
    }
    
    
    
    // this is the method for the currency convertor
    public static void convertor() {
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

       System.out.println("So your currency's are: " + currency1 + "  and " + currency2 + " you have to enter \"true\" or \"false\""); 
       boolean correct = input.nextBoolean();
       // value of currency
       System.out.println("Enter how many " + currency1 + " you have: ");
       if ("USD".equals(currency1)) {
         USD = input.nextDouble();
       }
       else if (currency1.equals("YEN")) {
        YEN = input.nextDouble();
       }
       else {
        EUR = input.nextDouble();
       }
       
      
       if (currency1.equals("USD") && currency2.equals("YEN")) {
            //
            System.out.println("That is " + USD*158.89 + " YEN.");
       }
       else if (currency1.equals("YEN") && currency2.equals("USD")) {
            System.out.println("That is " + YEN/158.89 + " USD");

       }
       else {
            //
            System.out.println("Invalid");
            

       }
       


       
       

       /*
       make currency convertor
       investment thingy
       math.random() for market changes
        New Update:
        Make currency convertor and investment thingy a method so you dont have to do one or the other to get to it
       */
    } 
    // make method here for investment app thing
    public static void investment() {
        // some code here blah blah blah
        System.out.println("\nHello, and welcome to the Invesment app! Here you can \n 1. Trade in the stock market\t2. Invest in crypto\t3. I don't want to do that");
    }
}