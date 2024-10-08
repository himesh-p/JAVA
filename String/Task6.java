/*  6. String Manipulation:
    Create a Java program that takes a user's input and formats it into a readable sentence, ensuring proper capitalization and removing leading/trailing spaces.

    6. String Manipulation:
    - Input: "   hello, world!   "
    - Expected Output: "Hello, world!" (formatted sentence with proper capitalization and no leading/trailing spaces)

 */


public class Task6 {
    public static void main(String[] args) {
        String word = "   hello, world!   ";
        System.out.println("Before trim :- "+word);
        System.out.println("After Trim :- "+word.trim().substring(0,1).toUpperCase()+word.trim().substring(1));
    }
}