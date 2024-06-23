//10. Mutability and Immutability:
//Create an immutable 'Point' class with fields 'x' and 'y'. Implement a constructor to initialize these fields and do not provide any setter methods. Ensure that the fields are private and final, and write methods to get the values of 'x' and 'y'.

class  Point{
    private int x;
    private int y;

    public Point(int x , int y){
        this.x = x;
        this.y = y;
    }

    void getValue(){
        System.out.println("The value of x is :- "+x);
        System.out.println("The value of y is :- "+y);
    }
};

public class Task10 {
    public static void main(String[] args) {
            Point obj = new Point(3, 4);
            obj.getValue();
    }
}
