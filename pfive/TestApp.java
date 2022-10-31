package pfive;

abstract class Parent{

    String name;
    abstract void ShowInfo();
}

class ChildOne extends Parent{

    @Override
    void ShowInfo() {
        System.out.println("Child One Got Implemented");
    }
}

class ChildTwo extends Parent{


    @Override
    void ShowInfo() {
        System.out.println("Child Two Got Implemented");
    }
}


public class TestApp {

    public static void main(String[] args) {

        Parent prefvar;
        //ChildOne cone = new ChildOne();
        prefvar = new ChildOne();  // Late Binding
        prefvar.ShowInfo(); // JVM will ref to the object


        prefvar = new ChildTwo();
        prefvar.ShowInfo();

    }
}
