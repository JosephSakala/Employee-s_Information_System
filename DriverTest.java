import java.util.*;//needed for the scanner class

class Employee{

    //instance variables
    private String employeeName;
    private String employeeNumber;
    private String hireDate;


    //this is a constructor
    public Employee(String employeeName, String employeeNumber, String hireDate){
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;

    }

    //mutatas
    public void setName(String employeeName){
        this.employeeName = employeeName;
    }
    public void setNumber(String employeeNumber){
        this.employeeNumber = employeeNumber;
    }
    public void setDate(String hireDate){
        this.hireDate = hireDate;
    }

    //Accessors
    
    public String getName(){
        return employeeName;
         
    }
    public String getNumber(){
        return employeeNumber;

    }
    public String getDate(){
        return hireDate;
    }

}

class ProductionWorker extends Employee{
    //this are instance variables
    private int shift;
    private double hourly_pay_rate;

    //this is a contructor 
    public ProductionWorker(String employeeName, String employeeNumber, String hireDate, int shift, double hourly_pay_rate)
    {
        super(employeeName, employeeNumber, hireDate);
        this.hourly_pay_rate = hourly_pay_rate;
        this.shift =shift;
    }

    //mutatas
    public void setShift(int shift){
        this.shift = shift;
        
    }
    public void setHourlyPayRate(double hourly_pay_rate){
        this.hourly_pay_rate = hourly_pay_rate;
    }

    //accessors
    public int getShift(){
        return shift;

    }

    public double getHourlyPayRate(){
        return hourly_pay_rate;
    }


    }




public class DriverTest{
    public static void main(String[]args){

        Scanner UserInput = new Scanner(System.in);
        ProductionWorker Details = new ProductionWorker(null, null, null, 0, 0);


        
        System.out.println("Enter Employee Details");
       System.out.print("Enter employee's name:");
        String name = UserInput.nextLine();
        Details.setName(name);

        System.out.print("Enter employee's number:");
        String number= UserInput.nextLine();
        Details.setNumber(number);

        System.out.print("Enter hired date:");
        String date = UserInput.nextLine();
        Details.setDate(date);

        System.out.print("Enter hourly pay rate:ZMK");
        double pay = UserInput.nextDouble();
        Details.setHourlyPayRate(pay);

        System.out.println("Select employee's shift \n1.Day shift\n2.Night shift");
        int Shirt_option = UserInput.nextInt();


        

        if(Shirt_option == 1){
            System.out.print("Employee's selected shift:Day");

        }
        else if(Shirt_option == 2){
            System.out.println("Employee's selected shift:Night");
        }
        else{System.out.print("Invalid input!");}

        Details.setShift(Shirt_option);

        System.out.println("Employees Information");
        


        System.out.println("Name:"+Details.getName());
        System.out.println("Employee's number:"+Details.getNumber());
        System.out.println("Hourly pay rate:"+Details.getHourlyPayRate());
        System.out.println("Hired date:"+Details.getDate());
        System.out.println("Shift:"+Details.getShift());


        UserInput.close();//closing the scanner object

        

    }

}