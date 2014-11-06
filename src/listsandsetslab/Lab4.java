package listsandsetslab;

import java.util.*;

/**
 *
 * @author eennis
 */
public class Lab4 {
    
    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
        
        employees.add(new Employee("John", "Doe", "333-33-3333", "111"));
        employees.add(new Employee("John", "Carter", "444-44-4444", "222"));
        employees.add(new Employee("John", "Smith", "555-55-5555", "333"));
        employees.add(new Employee("John", "Wiliker", "333-33-3333", "444"));
        
        Set<Employee> noDuplicates = new LinkedHashSet<>(employees);
        employees = new ArrayList<>(noDuplicates);
        
        System.out.println(employees.size());
        
        for(Employee e : employees){
            System.out.println(e.toString());
        }
        
    }
    
}
