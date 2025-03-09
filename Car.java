class Car{
private String  car_color;
private String car_brand;
private String car_fuel_type;
private String car_mileage;
public void start()
{
System.out.println("Car started");
}
public void stop()
{
System.out.println("car stopped");
}
public Car()
{
System.out.println("welcome to car garage");
}
public static void main(String[]args){
Car car1=new Car();
car1.car_color ="red";
car1.car_fuel_type="petrol";
car1.car_brand="Honda";

Car car2=new Car();
car2.car_color ="Blue";
car2.car_fuel_type="Diesel";
car2.car_brand="Toyato";

Car car3=new Car();
car3.car_color ="white";
car3.car_fuel_type="Electric";
car3.car_brand="FORD";
car1.start();
car1.stop();

car2.start();
car2.stop();

car3.start();
car3.stop();

System.out.println("car1_color: "+car1.car_color+" brand:"+car1.car_brand+"fuel_type:"+car1.car_fuel_type);
System.out.println("car2_color: "+car2.car_color+" brand:"+car3.car_brand+"fuel_type:"+car2.car_fuel_type);
System.out.println("car3_color: "+car3.car_color+" brand:"+car3.car_brand+"fuel_type:"+car3.car_fuel_type);

}
}