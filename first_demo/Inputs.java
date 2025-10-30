import java.util.Scanner;
public class Inputs{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter your rollno:");
            int rollno = input.nextInt();
            System.out.println("your rollno is: " + rollno);
        }

        }
    }