import java.lang.reflect.Array;
import java.util.*;
import java.lang.String;
public class Crypto {
    public static void main(String [ ] args) {
        System.out.println("Welcome to crypto");
        System.out.println("Enter the text you want to encrypt:");
        Scanner input = new Scanner(System.in);
        String usertxt = input.nextLine();

        String normtxt = normalizeText(usertxt);// Normalized text passed into obify.
        String obitxt = obify(normtxt);
        System.out.print("Enter the key to your encryption, it should be a number other than 0:");
        int key = input.nextInt();
        //if the value of key is less than -26 or greater than 26 , it might cause errors or bugs
        if ((key < -26)||(key > 26)){
            System.out.println("Invalid key!!");
        }
        String enrcptdtxt = ceaserify(obitxt, key);
        System.out.print("Enter the length of group: ");
        int grp = input.nextInt();
        String grpdString = groupify(enrcptdtxt, grp);
        System.out.println("Your message after Encryption is: ");
        System.out.println(grpdString);


    }
    // text normalizer , makes the text all upper case removes all spaces and punctuation marks.
    public static String normalizeText(String ut){
        ut = ut.toUpperCase();
        ut = ut.trim();
        ut = ut.replaceAll("\\s","");
        ut = ut.replaceAll("\\p{P}","");
        return ut;
    }
    public static String obify(String nt){
        nt = nt.replace("A", "AOB");
        nt = nt.replace("E","EOB");
        nt = nt.replace("I","IOB");
        nt = nt.replace("O","OOB");
        nt = nt.replace("U","UOB");
        nt = nt.replace("Y","YOB");
        return nt;
    }
    public static String ceaserify(String shftdtxt, int shift){
       String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String ceasertxt = "";
       for (int i = 0; i< shftdtxt.length(); i++){
           int charPosition = Alphabet.indexOf(shftdtxt.charAt(i));
           int keyVal = (shift + charPosition) % 26;
           char replaceVal = Alphabet.charAt(keyVal);
           ceasertxt += replaceVal;
        }
        return ceasertxt;
    }
    public static String groupify(String cipherString, int grp)
    {
        //Padding start
        int length = cipherString.length();
        String paddingString ="";
        if (length % grp != 0){
            int paddingLength = grp - (length % grp);
            for (int i=0; i<paddingLength; i++){
                paddingString += 'x';
            }
        }
        String paddedString = cipherString + paddingString;
        //Padding over
        String groupedString ="";
        String finalString="";
        int c=0;
        for (int i=0; i<paddedString.length();i++){
            groupedString += paddedString.charAt(i);
            ++c;
            if (c==grp){
                finalString+=(groupedString+" ");
                c=0;
                groupedString ="";
            }
        }
        return finalString;
    }

}




