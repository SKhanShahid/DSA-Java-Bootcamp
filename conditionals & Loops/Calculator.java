import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.print("Enter operator (+, -, *, /, %) or 'x' to exit: ");
            char op = sc.next().trim().charAt(0);
            if(op == 'x'){
                break;
            }
            System.out.print("Enter two numbers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            switch(op){
                case '+':
                    ans = num1 + num2;
                    break;
                case '-':
                    ans = num1 - num2;
                    break;
                case '*':
                    ans = num1 * num2;
                    break;
                case '/':
                    ans = num1 / num2;
                    break;
                case '%':
                    ans = num1 % num2;
                    break;
                default:
                    System.out.println("Invalid operator!");
                    continue;
            }
            System.out.println("Answer: " + ans);
        }
        sc.close();
    }
}