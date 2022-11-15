package pone;


//Covariant return Type : When in method Overriding we can change the return type of the method
class Employee{

    Employee Show(){
        System.out.println("Show Method of Employee");
        return new Employee();
    }
}

class ITEmployee extends  Employee{
    ITEmployee Show(){              //The Return type must be child of the parent class
                                    //Not applicable for primary data type
        System.out.println("Show Inherited From Employee Parent ..but got Changed");
        return new ITEmployee();
    }
}

public class TestCovarReturn {
    public static void main(String[] args) {
        Employee empone = new Employee();
        empone.Show();

        ITEmployee itEmployee = new ITEmployee();
        itEmployee.Show();
    }
}