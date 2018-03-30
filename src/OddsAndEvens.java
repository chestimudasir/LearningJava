import java.util.*;
public class OddsAndEvens {
    public static void main(String[] args) {
        //This is the opening part of the program.
        System.out.println("Let`s play a game called \"Odds And Evens\"");
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Hi " + name + ", Which do you choose? Odds(O) or Evens(E) ");
        String opt = input.next();
        if (opt.equals("O")) {
            System.out.println(name + " has picked odds! The computer will be Evens");
        } else if (opt.equals("E")) {
            System.out.println(name + " has picked evens! The computer will be Odds");
        } else {
            System.out.println("ERROR!!!!  Please enter a valid input " + name);
        }
        System.out.println("--------------------------------------------------------");

        //Get the number of fingers from the user and make decisions according to that

        System.out.print("How many \"fingers \" do you put? ");
        int usernumber = input.nextInt();


        if ((usernumber > 0 )&&(usernumber<6)) {
            //Random number generator
            Random rand = new Random();
            int compnmbr = rand.nextInt(6);
            System.out.println("The computer plays " + compnmbr + "\" fingers.\"");
            System.out.println("---------------------------------------------------");

            // generate the sum of the two numbers

            int sum = usernumber + compnmbr;
            System.out.println(usernumber + " + " + compnmbr + " = " + sum);
            // make the decision if the sum is evn
            if (sum % 2 == 0) {
                System.out.println(sum + " is ..Even!");
                if (opt.equals("E")) {
                    System.out.println("That means " + name + " wins!!");
                } else {
                    System.out.println("The computer wins.");

                }

            }
            if (sum % 2 != 0) {
                System.out.println(sum + " is ..Odd");
                if (opt.equals("O")) {
                    System.out.println("That means " + name + " wins!!");

                } else {
                    System.out.println("The computer wins");
                }

            }

        }else{
            System.out.println("Not valid ");
        }
    }
}

