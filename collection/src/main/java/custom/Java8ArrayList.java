package custom;

import model.Employee;
import utils.EmployeeDataGenerator;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8ArrayList {

    public static void main(String[] args) {
        List<Employee> list = EmployeeDataGenerator.generateData(10);

        final Integer departmentId = list.get(3).getDepartmentId();


        //Grouping employees by departmentId
        Map<Integer,List<Employee>> departmentEmployees = list.stream().collect(Collectors.groupingBy(Employee::getDepartmentId, Collectors.toList()));


        //Count employees by deparmentId
        Map<Integer,Long> departmentEmployeesCount = list.stream().collect(Collectors.groupingBy(Employee::getDepartmentId, Collectors.counting()));


        //Filter to fetch list of employee for only department Id {departmentId variable}
        Map<Integer,List<Employee>> departmentEmployeesFilter = list.stream()
                .filter(employee -> employee.getDepartmentId() == departmentId)
                .collect(Collectors.groupingBy(Employee::getDepartmentId, Collectors.toList()));

        System.out.println(departmentEmployees);

    }
}
