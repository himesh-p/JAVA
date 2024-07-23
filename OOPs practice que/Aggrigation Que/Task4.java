//Scenario 4: Online Shopping Cart
//Design an online shopping cart system where a shopping cart contains multiple items. The shopping cart class contains a list of item objects, representing an aggregation relationship.

class ShoppingCart{
    private int quntity;
    private String name;
    private double price;
    
    public ShoppingCart(int quntity , String name , double price){
        this.quntity = quntity;
        this.name = name;
        this.price = price;
    }
    public int getQuntity(){
        return quntity;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setQuntity(int qun){
        this.quntity = qun;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setPrice(double p){
        this.price = p;
    }
    public void display(){
        System.out.println("Quntity of the Item :- "+quntity);
        System.out.println("Name of the Item    :- "+name);
        System.out.println("Price of the Item   :- "+price);
    }
}

public class Task4 {
    public static void main(String[] args) {
        
    }
}