package practicejdk8.com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import static java.lang.StringUTF16.charAt;

public class SecondSalaryEMp {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));

        Optional<Employee> emp = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(emp);


        List<Double> stu1= employeeList.stream().map(i->i.getSalary()).collect(Collectors.toList());
        List<Double> st2=stu1.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
//        Stream<Double> doubleStream = st2.stream().filter(a -> a).collect(Collectors.toList());

//        System.out.println(doubleStream);
    }
}
