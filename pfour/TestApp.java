package pfour;



interface MS{
    String msname = "Harman";

    void SwitchOnMs();
    void SwitchOffMs();
}


interface AC{

    String acname = "Voltas";

    void SwitchOffAc();

    void SwitchOnAc();
}



class Car implements MS,AC{

    String carbrandname;

    void SwitchOnEngine(){
        System.out.println(carbrandname+" car engine got switched ON");
    }
    void SwitchOffEngine(){
        System.out.println(carbrandname+" car engine got switched OFF");
    }

    @Override
    public void SwitchOnMs() {
        System.out.println(msname+" MS got switched ON in "+carbrandname);
    }

    @Override
    public void SwitchOffMs() {
        System.out.println(msname+" MS got switched OFF in "+carbrandname);
    }

    @Override
    public void SwitchOnAc() {
        //acname = "Tiagon AC";
        System.out.println(acname+" AC got switched ON in "+carbrandname);
    }

    @Override
    public void SwitchOffAc() {
        System.out.println(acname+" AC got switched OFF in "+carbrandname);
    }
}


public class TestApp {
    public static void main(String[] args) {

        Car carobj = new Car();
        carobj.carbrandname = "Tata Tiago";
        carobj.SwitchOnEngine();
        carobj.SwitchOffEngine();

        carobj.SwitchOnMs();
        carobj.SwitchOffMs();

        carobj.SwitchOnAc();
        carobj.SwitchOffAc();
    }
}
