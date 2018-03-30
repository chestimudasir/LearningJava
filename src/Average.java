public class Average {
    public static void main(String args[]) {
        double num[] = {10.2, 11.3, 12.4, 13.5, 14.6};
        double result = 0;
        int i;
        for (i = 1; i<5; i++){
            result = result + num[i];
        System.out.println("The average is:  "+ (result/5));}
    }
}
