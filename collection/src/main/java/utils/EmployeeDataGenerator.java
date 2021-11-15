package utils;

import model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EmployeeDataGenerator {

    public static List<String> randomNames = Arrays.asList("Rif", "Sidd", "Shif", "Khan", "Zee", "Tinu");
    static Random departmentGenerator = new Random();

    public static List<Employee> generateData(int listSize) {
        List<Employee> list = new ArrayList<>();
        for (int i = 1; i <= listSize; i++) {
            Employee teamDetail = new Employee();
            teamDetail.setId(i);
            teamDetail.setName(randomNames.get(departmentGenerator.nextInt(4)));
            teamDetail.setDepartmentId(departmentGenerator.nextInt(5));
            list.add(teamDetail);
        }
        return list;
    }
}
