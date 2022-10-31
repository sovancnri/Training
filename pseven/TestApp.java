package pseven;

//Local Inner Class



class Car{

    private String carbrandname = "i20";

    void SwitchOnEngine(){
        System.out.println(carbrandname+" car engine got switched ON");

        // Now we will make MS and AC as inner local to the function of outer class
        //Local Non Static Nested Class or Local Inner Class
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

                System.out.println(acname+" AC got switched ON "+carbrandname);
            }
            void SwitchOffAc() {
                System.out.println(acname + " AC got switched OFF"+carbrandname);
            }
        }//Inner Classes Definitions ends here

        MS msobj = new MS();
        msobj.msname = "Harman Digital";
        msobj.SwitchOnMs();
        msobj.SwitchOffMs();

        AC acobj = new AC();
        acobj.acname = "Haer";
        acobj.SwitchOnAc();
        acobj.SwitchOffAc();


    }//Outer Class car function SwitchOnEngine Ends here
    void SwitchOffEngine(){
        System.out.println(carbrandname+" car engine got switched OFF");
    }


}

public class TestApp {
    public static void main(String[] args) {

        Car carobj = new Car();
        //carobj.carbrandname = "Audi";

        carobj.SwitchOnEngine();
        carobj.SwitchOffEngine();


    }
}
