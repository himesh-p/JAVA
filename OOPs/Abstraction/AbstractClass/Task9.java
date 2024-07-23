// //Scenario 9: Shopping Cart System
// //Develop an abstract class called "CartItem" with abstract methods like "calculatePrice" and "displayDetails." Implement derived classes like "ElectronicsItem" and "ClothingItem" that provide specific implementations for these abstract methods.

// abstract class CartItem{
//     private String name;
//     private double price;

//     public CartItem(String name , double price){
//         this.name = name;
//         this.price = price;
//     }

//     abstract void calculatePrice();
//     abstract void displayDetails();

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public void setPrice(double price) {
//         this.price = price;
//     }
    
// }

// class ElectronicsItem extends CartItem{
//     int count = 0;
//     int capacity = 10;

//     public ElectronicsItem(String name , double price){
//         super(name, price);
//     }

//     public void addItems(String name , double price){
//         if(count <= capacity){
            
//         }
//     }
// }

// public class Task9 {
//     public static void main(String[] args) {
        
//     }
// }
