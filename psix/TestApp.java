package psix;

// Member Non Static Nested Class or Member Inner Class








class Car{

    private String carbrandname = "i10";

    void SwitchOnEngine(){
        System.out.println(carbrandname+" car engine got switched ON");

    }
    void SwitchOffEngine(){
        System.out.println(carbrandname+" car engine got switched OFF");
    }//Outer Class car methods end here

    // Member Non Static Class Nested Class or Inner Class
    class MS{
        String msname;

        void SwitchOnMs() {
            System.out.println(msname + " MS got switched ON "+carbrandname);
        }
        void SwitchOffMs() {
            System.out.println(msname + " MS got switched OFF "+carbrandname);
        }
    }

    class AC{

        String acname;

        void SwitchOnAc() {
            //acname = "Tiagon AC";
            System.out.println(acname+" AC got switched ON "+carbrandname);
        }
        void SwitchOffAc() {
            System.out.println(acname + " AC got switched OFF"+carbrandname);
        }
    }
}//Class Car ends here


public class TestApp {
    public static void main(String[] args) {

        Car carobj = new Car();
        //carobj.carbrandname = "Audi";

        carobj.SwitchOnEngine();
        carobj.SwitchOffEngine();


        //Syntax : Outerclass.InnerClass refvarinnerclass = outerclasobj.new MS();
        Car.MS msobj = carobj.new MS();
        msobj.msname = "Phillips";
        msobj.SwitchOnMs();
        msobj.SwitchOffMs();

        Car.AC acobj = carobj.new AC();
        acobj.acname = "Voltas";
        acobj.SwitchOnAc();
        acobj.SwitchOffAc();
    }
}
