/*
 * CommissionEmployee.java
 *
 * Created on December 16, 2014, 12:57 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Tony
 */
public class CommissionEmployee extends Employee {
    
   private double grossSales;
   private double commissionRate;
   
    public CommissionEmployee( String first, String last, String ssn,
            double sales, double rate) 
    {
        super (first, last, ssn);
        setGrossSales( sales );
        setCommissionRate( rate );
    }
    //set commissionRate
    public void setCommissionRate( double rate )
    {
        commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;
    }//end rate
    
    //set commissionRate
    public double getCommissionRate()
    {
        return commissionRate;
    }//end get rate
    
    //set sales
    public void setGrossSales( double sales )
    {
        grossSales = ( sales < 0.0 ) ? 0.0 : sales;
    }//end set
    
    public double getGrossSales ()
    {
        return grossSales;
    }
        
    public double earnings()
    {
        return getCommissionRate() * getGrossSales();
    }//end earnings
    
    public String toString()
    {
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f", 
                "Commission Employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }//end toString
}//end commissionEmployee class
