import java.util.Scanner;
public class StringExample {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }

    static String greet() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        String greeting = "Hello, " + name + "! Welcome to the Java world.";
        sc.close();
        return greeting;
    }
}