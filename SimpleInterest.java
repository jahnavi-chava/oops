import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input Principal amount
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();
        
        // Input Rate of Interest
        System.out.print("Enter Rate of Interest (per annum): ");
        double rate = scanner.nextDouble();
        
        // Input Time period in years
        System.out.print("Enter Time period (in years): ");
        double time = scanner.nextDouble();
        
        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;
        
        // Display the result
        System.out.println("Simple Interest: " + simpleInterest);
        
        scanner.close();
    }
}
