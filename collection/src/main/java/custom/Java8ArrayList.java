package custom;

import model.Employee;
import utils.EmployeeDataGenerator;

import java.util.List;

public class Java8ArrayList {

    public static void main(String[] args) {
        List<Employee> list = EmployeeDataGenerator.generateData(10);
        
    }
}
