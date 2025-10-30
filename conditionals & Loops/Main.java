 
public class Main {
    public static void main(String[] args) {
        int salary = 50000;
        if(salary > 60000){
            salary = salary + 2000;
        }
        else{
            salary = salary + 1000;
        }
        System.out.println("Salary: " + salary);
    }
}