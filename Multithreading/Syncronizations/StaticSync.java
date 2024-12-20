class Table {   //Resource
    static synchronized void printTable(int n) {   //Static Synchronized Method
        for (int i=1; i<=10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        Table.printTable(1);
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        Table.printTable(2);
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        Table.printTable(3);
    }
}

class MyThread4 extends Thread {
    @Override
    public void run() {
        Table.printTable(4);
    }
}

public class StaticSync {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        MyThread4 t4 = new MyThread4();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
