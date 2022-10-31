package ptwo;

//Inheritance Of Concrete Class

class Animal{

    protected String name;
    protected String foodhabit;
    protected int no_of_limbs;

    void ShowGenInfo(){

        System.out.println("name = " + name);
        System.out.println("foodhabit = " + foodhabit);
        System.out.println("no_of_limbs = " + no_of_limbs);
    }
}

class Reptile extends Animal{

    String canSwim;

    void ShowSwimStatus(){
        System.out.println("In Reptile - The Swim Status is " + canSwim);
    }

}

class Avian extends Animal{

    String canfly;

    void ShowFly(){
        System.out.println("In Avian - The Fly status is " + canfly);
    }

}



public class TestApp {

    public static void main(String[] args) {
        Avian avobj = new Avian();
        avobj.name = "Parrot";
        avobj.foodhabit = "Herbivorous";
        avobj.no_of_limbs = 2;
        avobj.canfly = "Yes";

        avobj.ShowGenInfo();
        avobj.ShowFly();

        Reptile repobj = new Reptile();
        repobj.name = "Lizard";
        repobj.foodhabit = "Omnivorous";
        repobj.no_of_limbs = 4;
        repobj.canSwim = "Yes";

        repobj.ShowGenInfo();
        repobj.ShowSwimStatus();

    }


}
