package find.highes.paid.employee.detpwise;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestHighestSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Arun", "PHY", 1002),
                new Employee("Tarun", "PHY", 1006),
                new Employee("VArun", "BIO", 100),
                new Employee("KArun", "MATH", 100909),
                new Employee("Kiran", "MATH", 900)
        );
        Comparator<Employee> compareBySalary = Comparator.comparing(Employee::getSalary);
        Map<String, List<Employee>> EmployeeByDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(EmployeeByDept);
        Map<String, Optional<Employee>> EmpByDeptWithMaxSal = employeeList.stream().collect(
                Collectors.groupingBy(
                        Employee::getDept, Collectors.reducing(BinaryOperator.maxBy(compareBySalary)))
        );
        System.out.println(EmpByDeptWithMaxSal);
    }
}
