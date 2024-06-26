//7. Write a Java program to remove a specific element from an array.

public class Arr33{
	public static void main(String[] args){
		int nums[] = {20, 20, 30, 40, 50, 50, 50};
        System.out.println("Original Length: " + nums.length);

        System.out.print("Array elements are: ");
        for(int i=0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println("\b\b ");

        int index = 1;
                
        for(int i=0; i<nums.length; i++){
            if(nums[i] != nums[index - 1]) {
                nums[index++] = nums[i];
            }
        }

        System.out.print("Array elements are: ");
        for(int i=0; i < index; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println("\b\b ");

        System.out.println("\nThe new length after removing duplicate: " + index);
	}

}