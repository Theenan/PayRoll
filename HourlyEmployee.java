/*
 * HourlyEmployee.java
 *
 * Created on December 16, 2014, 12:36 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Tony
 */
public class HourlyEmployee extends Employee
{
    public double wage;
    public double hours;
    
    /** Creates a new instance of HourlyEmployee */
    public HourlyEmployee(String first, String last, String ssn,
            double hourlyWage, double hoursWorked) 
    {
        super (first, last, ssn);
        setWage( hourlyWage );
        setHours ( hoursWorked );
    }
    
    //set wage
    public void setWage( double hourlyWage)
    {
        wage = (hourlyWage < 0.0 ) ? 0.0 : hourlyWage;
    }//end set wage
    
    //get wage
    public double getWage()
    {
        return wage;
    }//end get
    
    public void setHours(double hoursWorked)
    {
        hours = (( hoursWorked >= 0.0) && (hoursWorked < 168.0))?
            hoursWorked : 0.0;
    }//end set
    
    public double getHours()
    {
        return hours;
    }// end get
    
    public double earnings()
    {
        if (getHours() <= 40)
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40 )* getWage() * 1.5;
    }//end earnings
    
    //return string for HourlyEmployee object
    public String toString()
    {
        return String.format("Hourly Employee: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage:", getWage(), 
                "hours worked", getHours());
    }//end toString
    
}//end class
