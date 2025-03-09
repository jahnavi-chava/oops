import java.util.Scanner;
class farhenit{
public static void main(String[]args){

Scanner input=new Scanner(System.in);
System.out.println("enter the temperature in celsius");
double celsius=input.nextDouble();
double farhenit=(celsius*9/5)+32;
System.out.println("temperatute in farhenit:"+farhenit);

}
}