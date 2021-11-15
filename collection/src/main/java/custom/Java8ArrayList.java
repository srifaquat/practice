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
        //Grouping employees by departmentId
        Map<Integer,List<Employee>> departmentEmployees = list.stream().collect(Collectors.groupingBy(Employee::getDepartmentId, Collectors.toList()));

        //Count employees by deparmentId
        Map<Integer,Long> departmentEmployeesCount = list.stream().collect(Collectors.groupingBy(Employee::getDepartmentId, Collectors.counting()));

        System.out.println(departmentEmployees);

    }
}
