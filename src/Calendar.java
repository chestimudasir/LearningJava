import java.util.Scanner;

public class Calendar {
    String inputDate;
    int monthDays [ ] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int days, months = 0, years=365, totalDays;
    public void getInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the date:");
        inputDate = input.nextLine();
    }
    public void computation(){
        days = (inputDate.charAt(0) - '0')*10 + (inputDate.charAt(1)-'0');


        int num = (inputDate.charAt(3)-'0')*10 + (inputDate.charAt(4)-'0');
        for (int i=0; i<num-1;i++){
            months += monthDays[i];
        }


        years = years*((inputDate.charAt(6)-'0')*1000 + (inputDate.charAt(7)-'0')*100 + (inputDate.charAt(8)-'0')*10 + (inputDate.charAt(9)-'0'));
        totalDays = days + months + years ;
    }

    void result(Calendar c){
        int num = c.totalDays - this.totalDays;
        System.out.println("The difference bteween two dates is "+(num/365)+" years "+((num%365)/30)+" months and "+((num%365)%30)+" days");
    }


}
