import java.util.Scanner;
class LargestNumber{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter a: ");
     int a = input.nextInt();
     System.out.println("enter b: ");
     int b = input.nextInt();
     System.out.println("enter c: ");
     int c = input.nextInt();
int largest = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);
    System.out.println("Largest Number: " + largest);
}
}