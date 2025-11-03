import java.util.Scanner;

public class switchExample {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String fruits = sc.nextLine();
        switch (fruits) {
            case "apple" -> System.out.println("A sweet red fruit");
            case "banana" -> System.out.println("A long yellow fruit");
            case "orange" -> System.out.println("A round orange fruit");
            default -> System.out.println("Unknown fruit");
        }

        sc.close();
    }
}