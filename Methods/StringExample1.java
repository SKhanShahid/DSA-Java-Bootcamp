import java.util.Scanner;
public class StringExample1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        String info = myGreet(name);
        System.out.println(info);
        sc.close();
    }
    static String myGreet(String naam) {
        String greeting = "Hello, " + naam + "! Welcome to the Java programming world.";
        return greeting;
    }
}