package listsandsetslab;

import java.util.*;

/**
 *
 * @author eennis
 */
public class Lab5 {
    
    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
        
        employees.add(new Employee("John", "Doe", "333-33-3333", "111"));
        employees.add(new Employee("John", "Carter", "444-44-4444", "222"));
        employees.add(new Employee("John", "Smith", "555-55-5555", "333"));
        employees.add(new Employee("John", "Wiliker", "333-33-3333", "444"));
        
        Map<String, Employee> employeeMap = new HashMap<>();
        
        // The key for the Map is the employee number, which is unique to each employee
        for(Employee e : employees){
            employeeMap.put(e.getEmpNo(), e);
        }
        
        System.out.println(employeeMap.get("222").toString());
        
        employeeMap.put("222", new Employee("John", "Simon", "666-66-6666", "222"));
        System.out.println(employeeMap.get("222").toString() + "\n");
        // When an object with the same key is put in the map, it overwrites the
        // previous entry.
        
        Set<String> employeeMapKeySet = employeeMap.keySet();
        List<String> employeeMapKeyList = new ArrayList<>(employeeMapKeySet);
        
        for(String s : employeeMapKeyList){
            System.out.println(employeeMap.get(s));
        }
        
        List<Employee> employeeMapValueList = new ArrayList<>(employeeMap.values());
        System.out.println("");
        
        for(Employee e : employeeMapValueList){
            System.out.println(e.toString());
        }
        
    }
    
}
