import java.util.Scanner;
class celsius{
public static void main(String[]args){

Scanner input=new Scanner(System.in);
System.out.println("enter the temperature in fahrenit");
double fahrenit=input.nextDouble();
double celsius=(fahrenit-32)*5/9;
System.out.println("temperatute in celsius:"+celsius);

}
}