/*
 * Employee.java
 *
 * Created on December 16, 2014, 11:30 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Tony
 */
public abstract class Employee {
    
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    //three argument constructor
    public Employee(String first, String last, String ssn )
    {
     firstName = first;
     lastName = last;
     socialSecurityNumber = ssn;
    }
    
    //set first name
    public void setFirstName (String first)
    {
        firstName = first;
    }//end set first
    
    //get firstName
    public String getFirstName()
    {
        return firstName;
    }//end get
    
    //set lastName
    public void setLastName (String last)
    {
        lastName = last;
    }//end set
    
    //get lastName
    public String getLastName ()
    {
        return lastName;
    }// end get
    
    //set socialSecurityNumber
    public void setSocialSecurityNumber (String ssn)
    {
        socialSecurityNumber = ssn;
    }//end set
    
    //get socialSecurityNumber
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }//end get
    
    //return string rep of Employee object
    public String toString()
    {
        return String.format("%s %s \nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }//end string method
    
    //abstract method
    public abstract double earnings();
    
}//end abstract class employee
