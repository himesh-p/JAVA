class Way1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread(Way1) is running...");
        // System.out.println(Thread.currentThread().getState());
    }
}

class Way2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread(Way2) is running...");
        // System.out.println(Thread.currentThread().getState());
    }

    public String getState() {
        return Thread.currentThread().getState().toString();
    }
}

public class CreateThread {
    public static void main(String[] args) {
        // Way1 one = new Way1();
        // System.out.println(one.getState());
        // one.run();

        // Way2 two = new Way2();
        // System.out.println(two.getState());
        // two.run();

        Thread three = new Thread("tran");
        System.out.println(three.getState());
        three.start();
        System.out.println(three.getState());
        three.run();
        System.out.println(three.getState());
        three.interrupt();
        System.out.println(three.getState());
    }
}