public class Mario {
    public static void main(String args[])
    {
        int i, j , k;
        for (i=0;i<4;i++){
            for (j=0;j<(4-i-1); j++)System.out.print(" ");
                for (k=0;k<(i+2);k++){
                    System.out.print("#");
                }
                System.out.println();
        }
    }
}
