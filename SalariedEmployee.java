/*
 * SalariedEmployee.java
 *
 * Created on December 16, 2014, 12:28 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Tony
 */
public class SalariedEmployee extends Employee {
    
    private double weeklySalary;
    
    public SalariedEmployee( String first, String last, String ssn, 
            double salary) 
    {
        super(first, last, ssn);//pass to Employee Constructor
        setWeeklySalary( salary );//validate and story salary
    }
    
    //set salary
    public void setWeeklySalary( double salary )
    {
        weeklySalary = salary <0.0 ? 0.0 : salary;
    }//end set
    
    //get salary
    public double getWeeklySalary()
    {
        return weeklySalary;
    }
    
    public double earnings()
    {
        return getWeeklySalary();
    }
    
    public String toString()
    {
        return String.format("Salaried Employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }//end toString
}//end class SalariedEmployee
