package Assessment;

public class Janitor extends Employee {
    public int getHours()
    {
        return 2*super.getHours();
    }
    public double getSalary()
    {
        return super.getSalary() - 10000;
    }
    public int getVacationDay()
    {
        return super.getVacationDay();
    }
    public void clean()
    {
        System.out.println("Workin' for the man");
    }
    public static void main(String args[]);
    {
        Janitor j =new Janitor();
        j.getHours();
        j.getSalary();
        j.getVacationDay();
        


    }



    
    
        

    ]
    
}
