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
       else if (currency1.equals("USD") && currency2.equals("EUR")) {
            System.out.println("That is " + USD*0.89 + " EUR");
       }
       else if (currency1.equals("EUR") &&  currency2.equals("USD")) {
            System.out.println("That is " + EUR*1.12 + " USD");
       }
       else if (currency1.equals("YEN") && currency2.equals("EUR")) {
            System.out.println("That is " + YEN*0.0056 + " EUR");
       }
       else if (currency1.equals("EUR") && currency2.equals("YEN")) {
            System.out.println("That is " + EUR/177.66 + " YEN");
       }
       else {
        System.out.println("Invalid operation");
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
        // make another scanner
        Scanner input = new Scanner(System.in);
        // some code here blah blah blah
        System.out.println("\nHello, and welcome to the Invesment app! Here you can \n 1. Trade in the stock market\t2. Invest in crypto\t3. I don't want to do that");
        int choice = input.nextInt(); 
        if (choice == 1) {
            System.out.println("How much money do you have:\t");
            double money = input.nextDouble();
            stonks(money);
        }
        else if (choice == 2) {
            System.out.println("How much money do you have:\t");
            double moolah = input.nextDouble();
            
            crypto(moolah);

        }
        else {
            System.out.println("Dang thats too bad");
        }
    }
    

    // invest in crypto xd (literally just choose your own adventure)
    public static void crypto(double money) {
        // scanner
        Scanner input = new Scanner(System.in);
        // i have no clue how to use or make 2d arrays so i gotta learn how to make them
        // this code is going to be so bad so look away
        String[][] coins = {
            {"Buy a Meme coin!", "Buy more shares of A MEME COIN (amc) !", "AMC"},
            {"Buy shares of STONK", "Buy more shares of STONK!", "STONK"},
            {"Buy shares of Flork", "Buy more shares of Flork", "FLORK"}
        };
        String[][] prices = {
            {" just got rugpulled. yikes. All of your money is gone", " THE COIN IS SKYROCKETING "},
            {"The coin has stayed stable for a while. "," rose a little bit "},
            {" You lost ALL of your money ","YOU ARE A MILLIONAIRE"}

        };
        double[][] coinPrices = {
            // base prices for each coins. 1,2,3, are base prices and 4,5,6 are the market cap
            {.056, 0.00012, 0.00037},
            {12005600, 14120413, 686563000},

        };      
        String[][] scenes = {
            {"Today is your first day. Ready to become a crypto master? ","Its a rough day. Your portfolio is down. Call it quits?(y/n)","Dude, pull out now. Everything is up. Do you hold on? Remember, you only live once ;) (do you hold on y/n)"},
            {"Second day. The market just opened. Are you ready?\n your ", "You lost all of your money. You lose. ", "Next day. Your coins value rose. "},
            {"The coin value is down. What will you do? ", "Coin value dropped a little", "YO, you pulled out of the coin just before it got rugpulled. Nice!"}
        };

        // this stuff 
        System.out.println("\nHello and welcome to crypto!\n What coins would you like to invest in?\n 1. A brand new coin! May go up in value ;) \t 2. A already existing coin like bitcoin (boring)\tor #3: Bro i just want to gamble");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("So, you choose to invest in a brand new coin! You have $" + money + " Whart will you choose? \n" + coins[1][1] + " or " + coins[1][2] + " or " + coins[1][3]);
            


        }
    }
    public static void stonks(double money) {


    }

}