import java.util.Scanner;
import java.lang.Math;
public class VacationPlanner {
    public static void main(String[ ] args){
        greetings();
        resources();
        timeDiff();
        area();
        distance();
    }
    //Ask the user about himself in a erratic fashion.
    public static void greetings(){
        System.out.println("Hello fellow traveler!");
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("So you go by the name of "+name);
        System.out.println("Well I have traveled around the world and can be of great help.");
        System.out.print("Would you like me to tell you which land awaits you? ");
        String land = input.nextLine();
        System.out.println(land+", a great place to visit");
        System.out.println("____________________________________________");
        System.out.println();
    }
    //Ask user about his budget and convert it into other curreny.
    public static void resources(){
        Scanner input =new Scanner(System.in);
        System.out.print("For how many days do you plan to stay there? ");
        int days = input.nextInt();
        int hrs, mins;
        hrs = days * 24;
        mins = hrs * 60;
        System.out.print("So you are staying for "+hrs);
        System.out.print(" hours or "+mins);
        System.out.print(" mins");
        System.out.print(" So, what is your budget? Obviously in $ ");
        int bdgt = input.nextInt();
        System.out.print("What is the three letter currency symbol for your destination? ");
        String cur = input.next();
        System.out.print("How many "+(cur));
        System.out.print(" are there in 1 $");
        double exch = input.nextDouble();

        double bdgtexch = bdgt * exch;
        bdgtexch *= 100;
        bdgtexch=(int) bdgtexch;
        bdgtexch /= 100;


        double perday1 = bdgt/days;
        perday1 *= 100;
        perday1 = (int)perday1;
        perday1 /= 100;

        double perday2 = bdgtexch/days;
        perday2 *= 100;
        perday2 = (int)perday2;
        perday2 /= 100;


        System.out.print("Your budget in $ is "+(bdgt));
        System.out.print(" You can spend "+perday1);
        System.out.print(" per day.");
        System.out.println(" Your budget in "+(cur));
        System.out.print("is "+bdgtexch);
        System.out.print(" and you can spend "+perday2);
        System.out.println(" per day");
        System.out.println("_________________________________________");
        System.out.println();


    }
    //Ask user about the time difference between the two countries
    public static void timeDiff(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination?");
        int timediff = input.nextInt();
        int accmid = ((24 + timediff)%24);
        int accnoon = ((24 + timediff + 12)%24);
        System.out.println("That means that when it is midnight at home it will be "+accmid+":00 in your travel destination and when it is noon at home it will be "+accnoon+":00");
        System.out.println("_________________________________________________");
        System.out.println();
    }
    public static void area(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination in kilometers? ");
        double areakms = input.nextDouble();
        areakms *= 0.621;
        System.out.println("The square area in miles is "+areakms);
        System.out.println("______________________________________________");
        System.out.println("");
    }
    public static void distance(){
        double x1, x2, y1, y2;
        double distnce;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the latitude of your home :");
        x1 = input.nextDouble();
        System.out.println("Enter the longitude of your home :");
        y1 = input.nextDouble();
        System.out.println("Enter the latitude of your destination: ");
        x2 = input.nextDouble();
        System.out.println("Enter the longitude of your destination: ");
        y2 = input.nextDouble();
        double a = Math.sin((x2-x1)/2) * Math.sin((x2-x1)/2);
        double b = (Math.cos(x1) * Math.cos(x2)) * (Math.sin((y2-y1)/2) * Math.sin((y2-y1)/2));
        double d = Math.sqrt(a+b);
        distnce = (2*6371) * (Math.asin(d));
        distnce *=100;
        distnce = (int)distnce;
        distnce /= 100;
        System.out.println("The distance between your home and destination is :"+distnce+"kms");
    }
}
