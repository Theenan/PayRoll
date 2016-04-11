/*
 * BasePlusCommissionEmployee.java
 *
 * Created on December 16, 2014, 1:22 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Tony
 */
public class BasePlusCommissionEmployee extends CommissionEmployee
{
    private double baseSalary;
    
    //6 argument constructor
    public BasePlusCommissionEmployee( String first, String last, String ssn,
            double sales, double rate, double salary) 
    {
        super( first, last, ssn, rate, sales );
        setBaseSalary( salary );
    }
    
    //set baseSalary
    public void setBaseSalary(double salary)
    {
        baseSalary = (salary < 0.0 ) ? 0.0: salary;
    }//end baseSalary
    
    //get baseSalary
    public double getBaseSalary()
    {
        return baseSalary;
    }//end get
    
    //calculates earnings
    public double earnings()
    {
        return getBaseSalary() + super.earnings();
    }//end earnings
    
    public String toString()
    {
        return String.format("%s %s; %s: $%,.2f",
                "Base-Salaried", super.toString(),
                "Base Salary", getBaseSalary());
    }//end String
    
}//end BasePlusCommissionEmployee
