package org.acme;

import java.util.ArrayList;
import java.util.List;

public class DemoApp {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Abc", "DEL", 25000D);
        Employee emp2 = new Employee(2, "Def", "DEL", 35000D);
        Employee emp3 = new Employee(3, "Ghi", "GUR", 45000D);
        Employee emp4 = new Employee(4, "Jkl", "GUR", 55000D);
        Employee emp5 = new Employee(5, "Mno", "NDA", 65000D);
        Employee emp6 = new Employee(6, "Pqr", "NDA", 75000D);
        Employee emp7 = new Employee(7, "Stu", "BOM", 85000D);
        Employee emp8 = new Employee(8, "Vwx", "BOM", 95000D);
        Employee emp9 = new Employee(8, "Yza", "PUN", 105000D);
        Employee emp10 = new Employee(8, "Bxd", "PUN", 105000D);

        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);
        empList.add(emp7);
        empList.add(emp8);
        empList.add(emp9);
        empList.add(emp10);

        List<Employee> list = empList.stream().filter(emp -> emp.getLocation().equals("DEL")).toList();

        System.out.println("list : "+ list);

        List<Long> ids = list.stream().map(Employee::getEmpId).toList();

        System.out.println("ids : "+ ids);

    }
}
