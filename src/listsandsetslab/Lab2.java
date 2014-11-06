package listsandsetslab;

import java.util.*;
import listsandsetslab.Employee;

/**
 *
 * @author eennis
 */
public class Lab2 {
    
    public static void main(String[] args) {
    
        List employees = new ArrayList();
        
        employees.add(new Employee("John", "Doe", "333-33-3333", "111"));
        employees.add(new Employee("John", "Carter", "444-44-4444", "222"));
        employees.add(new Employee("John", "Smith", "555-55-5555", "333"));
        employees.add(new Employee("John", "Wiliker", "333-33-3333", "444"));
        
        System.out.println(employees.size());
       
        Employee emp = (Employee)employees.get(1);
        System.out.println(emp.toString() + "\n");
        
        for(int i = 0; i < employees.size(); i++){
            System.out.println(employees.get(i).toString());
        }
        
        System.out.println("\n" + employees.isEmpty());
        employees.clear();
        System.out.println(employees.isEmpty());
        
    }
    
}
