package pone;
// Need Of MultiThreading
class Employee extends Thread{

    String ename;

    public Employee(String ename) {
        this.ename = ename;
    }

    public void run(){
        for(int start =0;start <= 10; start++){
            System.out.println(ename+" prints "+start);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class TestApp {
    public static void main(String[] args) {

        Employee empone = new Employee("Rohan");
        Employee emptwo = new Employee("Mack");

        empone.start();
        emptwo.start();

        for(int start =0;start <= 10; start++){
            System.out.println("Primary Threaded objects prints "+start);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
