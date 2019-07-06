package C17Lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author Fredson Sumi
 */
public class ProcessingEmployees {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")};
        
        List<Employee> list = Arrays.asList(employees);
        System.out.println("Complete employee list:");
        list.stream().forEach(System.out::println);
        
        // Predicate que retorna true para salários no intervalo US$ 4000-US$ 6000
        Predicate<Employee> fourToSixThousand = 
                e -> e.getSalary() >= 4000 && e.getSalary() <= 6000;
        
        // Exibe Employees com salários no intervalo US$ 4000-US$ 6000
        // classificados em ordem crescente por salário
        
        System.out.printf(
            "%nEmployees earning $4000-$6000 per month sorted by salary:%n");
        
        list.stream()
                .filter(fourToSixThousand)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);
        
        System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
                list.stream()
                        .filter(fourToSixThousand)
                        .findFirst()
                        .get());
        
        // Functions para obter o nome e o sobrenome de um Employee
        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;
        
        // Comparator para comparar Employees pelo sobrenome, então, pelo nome
        Comparator<Employee> lastThenFirst = 
                Comparator.comparing(byLastName).thenComparing(byFirstName);
        
        // classifica funcionários pelo sobrenome e, então, pelo nome
        System.out.printf(
                "%nEmployees in ascending order by last name then first:%n");
                
        list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);
        
        // exibe os sobrenomes únicos dos funcionários classificados
        System.out.printf("%nUnique employee last names:%n");
        list.stream()
                .sorted(lastThenFirst)
                .map(Employee::getLastName)
                .forEach(System.out::println);
        
        
        // exibe apenas o nome e o sobrenome
        System.out.printf(
            "%nEmployee names in order by last name then first name:%n");
        list.stream()
                .sorted(lastThenFirst)
                .map(Employee::getName)
                .forEach(System.out::println);
        
        // agrupa Employees por departamento
        System.out.printf("%nEmployees by department:%n");
        Map<String, List<Employee>> groupByDepartment = 
                list.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment));
        
        groupByDepartment.forEach((department, employeesInDepartment) -> {
                System.out.println(department);
                employeesInDepartment.forEach(
                        employee -> System.out.printf("   %s%n", employee));
                System.out.printf("   Employees count: %d%n", 
                        employeesInDepartment.stream().count());
            }
        );
        
        // conta o número de Employees em cada departamento
        System.out.printf("%nCount of Employees by department:%n");
        Map<String, Long> employeeCountByDepartment = 
                list.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment, 
                            Collectors.counting()));
        employeeCountByDepartment.forEach((department, employeesCount) -> {
                System.out.printf("%s has  %d employees%n", 
                        department, employeesCount);
            }
        );
        
        // soma os salários dos Employees com o método de soma DoubleStream
        System.out.printf(
            "%nSum of Employees' salaries (via sum method): %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .sum());
        
        // calcula soma dos salários dos Employees com o método reduce Stream
        System.out.printf(
            "Sum of Employees' salaries (via reduce method): %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .reduce(0, (x, y) -> x + y));
        
        System.out.printf("Average of Employees' salaries: %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .average()
                        .getAsDouble()
                );
        
                    
    }
}
