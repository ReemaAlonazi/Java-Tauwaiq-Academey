public class Employee {
    int emp_ID; //attributes
    String name;
    String depart;
    double salary;
    double bouns;
    boolean resident;



    public Employee(){//constructors
        emp_ID =442002711;
        name = "Reema";
        depart = "IT";
        salary=50000.5;
        bouns=0.40;
        resident = false;
    }
    public Employee(int emp_ID, String name){
        this.emp_ID =44332211;
        this.name = "Dana";
    }
    public Employee(int emp_ID, String name , boolean resident){
        this.emp_ID =42300578;
        this.name = "Sara";
        this.resident = true;
    }
    public Employee(int emp_ID, String name ,String depart,double salary ,double bouns,boolean resident){
        this.emp_ID =4980664;
        this.name = "khalid";
        this.depart ="HR" ;
        this.salary = 30000.500;
        this.bouns =0.10;
        this.resident = false;
    }



    public void setSalary(double salary){//methods
        this.salary= salary;
    }
    public void setSalary(double salary, double bouns){
        this.salary=salary;
        this.bouns=bouns;
    }
    public void setDepart(String depart){
        this.depart=depart;
    }
    public void setEmp_ID(int emp_ID){
        this.emp_ID=emp_ID;
    }
    public void print_Emp_Dara(){
        System.out.println("Employee ID is: "+ emp_ID);
        System.out.println("Employee name is: "+ name);
        System.out.println("Employee Department is: "+ depart);
        System.out.println("Employee salary is: "+ salary);
        System.out.println("Employee bouns is: "+ bouns);
        System.out.println("Employee resident is: "+ resident);
    }
}
