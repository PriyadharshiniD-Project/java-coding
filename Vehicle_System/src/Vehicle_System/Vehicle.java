package Vehicle_System;
import java.util.*;
abstract class Vehicle {
private String registrationNo;
private String brand;

Vehicle(String registrationNo,String brand)
{
	this.registrationNo=registrationNo;
	this.brand=brand;
}
public String getRegistrationNo() {
	return registrationNo;
}
public String getBrand() {
	return brand;
}
public double getRent(double rent)
{
	return rent;
}
}
//Car
class Car extends Vehicle{
	private String model;
	private double rentPerDay;
	Car(String registrationNo,String brand,String model,double rentPerDay)
	{
		super(registrationNo,brand);
		this.model=model;
		this.rentPerDay=rentPerDay;
	}
	public double getRent()
{
		return rentPerDay;
		}
}
//Bike
class Bike extends Vehicle{
	private int engineCapacity;
	private double rentPerDay;
	Bike(String registrationNo,String brand,int engineCapacity,double rentPerDay){
		super(registrationNo,brand);
		this.engineCapacity=engineCapacity;
		this.rentPerDay=rentPerDay;
	}
	public double getRent()
	{
		return rentPerDay;
	}
}
// Main
class Driver{
	public static void main(String[] args) {
		Car c=new Car("152874","Taar","toyato",1000);
		System.out.println("The rent per day: "+c.getRent());
	
		Bike b=new Bike("125874","Pulser",500,1500);
		System.out.println("The Rent Per Day: "+b.getRent());
}
}
