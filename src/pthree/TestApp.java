package pthree;

// Inter Thread Communication - wait() and notify() from Object Class

class Tortoise extends Thread{
    int oddNum = 1;
    Object obj;

    Tortoise(Object obj){
        this.obj = obj;
    }


    public void run(){
        for(int start = 0;start <= 10; start++){
            synchronized (obj){
                System.out.println("Tortoise Prints "+oddNum);
                oddNum += 2;


                try {

                    obj.wait();
                    obj.notify();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


        }
    }
}

class Rabbit extends Thread{
    int evenNum = 2;
    Object obj;

    Rabbit(Object obj){
        this.obj = obj;
    }
    public void run(){
        for(int start = 0;start <= 10; start++) {
            synchronized (obj){
                System.out.println("Rabbit Prints " + evenNum);
                evenNum += 2;

                try {
                    obj.notify();
                    obj.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

public class TestApp {
    public static void main(String[] args) {

        Object obj = new Object();
        Tortoise tobj = new Tortoise(obj);
        Rabbit robj = new Rabbit(obj);

        tobj.start();
        robj.start();
    }
}
