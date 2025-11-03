import java.util.Scanner;
public class switchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruits = sc.nextLine();
        switch(fruits) {
            case "apple":
                System.out.println("A sweet red fruit");
                break;
            case "banana":
                System.out.println("A long yellow fruit");
                break;
            case "orange":
                System.out.println("A round orange fruit");
                break;
            default:
                System.out.println("Unknown fruit");
                break;
        }

        sc.close();
    }
}