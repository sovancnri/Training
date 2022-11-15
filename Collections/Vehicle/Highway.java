package Vehicle;

class Vehicle extends Thread{
    String vname;
    Object obj;

    Vehicle(String s,Object obj){
        this.vname = s;
        this.obj = obj;
    }
    public void run(){
        synchronized (obj) {
            Highway.crossBridge(vname);
            Highway.crossTollbooth(vname);
        }
    }
}

class Highway{


    static void crossBridge(String s){
        System.out.println(s+" has passed the Bridge");
    }
    static void crossTollbooth(String s){
        System.out.println(s+" has passed the TollBooth");
    }

    public static void main(String[] args) {
        Object obj = new Object();
            Vehicle car1 = new Vehicle("First Car", obj);
            Vehicle car2 = new Vehicle("Second Car", obj);
            Vehicle car3 = new Vehicle("Third Car", obj);
            Vehicle car4 = new Vehicle("Fourth Car", obj);
            Vehicle car5 = new Vehicle("Fifth Car", obj);


        synchronized (obj) {
            car1.start();
            car2.start();
            car3.start();
            car4.start();
            car5.start();
        }
        try {
            car1.join();
            car2.join();
            car3.join();
            car4.join();
            car5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("All Vehicles have passed");
    }
}

