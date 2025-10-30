import java.util.Scanner;
public class TemperatureConverter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float tempC = sc.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + tempF);
    
        sc.close();
    }
}