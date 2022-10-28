package ptwo;

class Calle{


    //synchronized void ShoutOut(String msg){
    void ShoutOut(String msg){
        //synchronized (this){
            System.out.print("["+msg);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print("]");
        //}

    }//ShoutOut Scope Ends here
}

class Caller extends Thread{

    String message;
    Calle cobj;

    Caller(String ms,Calle c){
        message = ms;
        cobj = c;
    }
    public void run(){
        synchronized (cobj){
            cobj.ShoutOut(message);
        }
    }
}

public class TestApp {
    public static void main(String[] args) {

        Calle commonobj = new Calle();

        Caller sandeep = new Caller("Hi",commonobj);
        Caller ujan = new Caller("To",commonobj);
        Caller shreya = new Caller("Java",commonobj);

        sandeep.start();
        ujan.start();
        shreya.start();
    }
}
