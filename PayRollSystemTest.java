/*
 * PayRollSystemTest.java
 *
 * Created on December 16, 2014, 1:32 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Tony
 */
public class PayRollSystemTest {
    
    /** Creates a new instance of PayRollSystemTest */
    public static void main( String args[])
    {
        //create subclass objects
        SalariedEmployee salariedEmployee = 
                new SalariedEmployee( "Jane", "Doe", "233-55-6525", 900.00);
        HourlyEmployee hourlyEmployee = 
                new HourlyEmployee("James", "Doe", "655-98-7777", 17.50, 40);
        CommissionEmployee commissionEmployee = 
                new CommissionEmployee("John", "Doe", "458-78-2525", 
                25000, 0.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = 
                new BasePlusCommissionEmployee("Jack", "Doe", "985-48-2669",
                15000, 0.05, 600);
        
        System.out.println("Employees proccessed seperatly:\n");
        
        System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "earnded",
                salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned",
                hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "earned",
                commissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, 
                "earned", basePlusCommissionEmployee.earnings());
        
        //create array
        Employee employees[] = new Employee[4];
        
        //starts array
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        
        System.out.println("Employees processed polymorphically:\n" );
        
        //process elements of array
        for (Employee currentEmployee : employees )
        {
            System.out.println( currentEmployee );
            
            //determine if employee is base plus commisson
            if( currentEmployee instanceof BasePlusCommissionEmployee )
            {
                BasePlusCommissionEmployee employee = 
                        ( BasePlusCommissionEmployee ) currentEmployee;
                double oldBaseSalary = employee.getBaseSalary();
                employee.setBaseSalary( 1.10 * oldBaseSalary );
                System.out.printf(
                        "New base salary with 10%% increase is: $%,.2f\n",
                        employee.getBaseSalary());
            }//end if
            
            System.out.printf( "earned $%,.2f\n\n",
                    currentEmployee.earnings());
        }//end for
        
        //get type name
        for ( int j = 0; j < employees.length; j++ )
            System.out.printf("Employee %d is a %s\n", j, 
                    employees[j].getClass().getName());
    }//end main
    
}//end class
