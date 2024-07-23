//Scenario 1: Vehicle Rental System
//In a vehicle rental system, create a base class called "Vehicle" with a method called "rent" that performs the rental process. Implement derived classes like "Car" and "Motorcycle" that override the "rent" method with their specific rental processes.

class Vehical{
    private String brand;
    private String name;
    private double rent;
    
    public Vehical(String brand , String name , double rent){
        this.brand = brand;
        this.name = name;
        this.rent = rent;
    }

    public void displayDetails(){
        System.out.println("The brand of this vehical is :- "+brand );
        System.out.println("The name of this Vehical is :- "+name);
        System.out.println("The rent of this vehical is :- "+rent);
    }
    public void setRent(double rent){
        this.rent = rent;
    }
}

class Car extends Vehical{
    public Car(String brand , String name , double rent){
        super(brand, name, rent);
    }

    @Override
    public void displayDetails(){
        System.out.println("This details is only for car :- ");
        // System.out.println("The brand of this vehical is :- "+brand );
        // System.out.println("The name of this Vehical is :- "+name);
        // System.out.println("The rent of this vehical is :- "+rent);
    }
}

public class Task1 {
    public static void main(String[] args){

    }
}
