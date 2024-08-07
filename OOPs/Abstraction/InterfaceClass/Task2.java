//Scenario 2: Messaging Service Integration
//Develop an interface called "MessagingService" with methods like "sendMessage" and "receiveMessage." Implement classes like "EmailService" and "SMSService" that provide specific implementations for these interface methods.

interface MessagingService{
    void sendMessage();
    void receiveMessage();
}

class EmailService implements MessagingService{
    private String messege;
    private int size;

    public EmailService(String messege , int size){
        this.messege = messege;
        this.size = size;
    }

    @Override
    public void sendMessage(){
        System.out.println("The messege is generated by the email.");
        System.out.println("The Messege is :- "+messege);
        System.out.println("The size of this messege is :- "+size);
        System.out.println("The messege was send by Dhruv Sharma.");
    }

    @Override 
    public void receiveMessage(){
        System.out.println("The messege was recive by the user.");
    }
}

class SMSService implements MessagingService{
    private String messege;
    private int size;

    public SMSService(String messege , int size){
        this.messege = messege;
        this.size = size;
    }

    @Override
    public void sendMessage(){
        System.out.println("The messege is generated by the SMS.");
        System.out.println("The Messege is :- "+messege);
        System.out.println("The size of this messege is :- "+size);
        System.out.println("The messege was send by Himesh Patel.");
    }

    @Override 
    public void receiveMessage(){
        System.out.println("The messege was recive by the user.");
    }
}

public class Task2 {
    public static void main(String[] args) {
         EmailService obj1 = new EmailService("Hii How Are You?", 10);
         SMSService obj2 = new SMSService("Hii I Am Himesh Patel", 15);
         
         obj1.sendMessage();
         obj1.receiveMessage();

         obj2.sendMessage();
         obj2.receiveMessage();
    }
}
