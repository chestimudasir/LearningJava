public class Controlflow {
    public static void main(String[ ]args){
        System.out.println("Starting main method..");
        message1();
        message2();
        message3();
        System.out.println("We are done with the messages");
    }
    public static void message1(){
        System.out.println("this is the first message");
    }
    public static void message2(){
        message1();
        System.out.println("This is the second message");
    }
    public static void message3(){
        message1();
        message2();
        System.out.println("This is the third message");

    }
}
