package pone;

// this vs super keyword
// Constructor Chaining

class Parent{
    Parent(){
        System.out.println("Parent Class - Zero Parameterized Constructor");
    }

    Parent(int a){
        System.out.println("Parent Class - Single Parameterized Constructor");
    }
    void Show(){
        System.out.println("Parent CLass - Just a method in Parent Class");
    }
}
class Sample extends Parent{

    Sample() {
        System.out.println("Sample Class - Zero parameterized Constructor");
    }
    Sample(int a){
        this();
        System.out.println("Sample class - Single parameterized Constructor");
    }
    Sample(int a, int b){
        this(2);
        super.Show();
        System.out.println("Sample class - Double parameterized Constructor");
    }
}

public class TestApp {

    public static void main(String[] args) {

        Sample sampleobj = new Sample(2,3); //Compiler Resolves

    }

}
