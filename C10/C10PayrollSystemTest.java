package C10;

import C08.C08Date;

public class C10PayrollSystemTest {
    public static void main(String[] args){
        
        C10SalariedEmployee salariedEmployee = 
            new C10SalariedEmployee("John", "Smith", "111-11-111", 800.00, 
                    new C08Date(1, 1, 1));
        C10HourlyEmployee hourlyEmployee = 
            new C10HourlyEmployee("Karen", "Price", "222-22-222", 16.75, 40,
                new C08Date(1, 1, 1));
        C10CommissionEmployee commissionEmployee =
            new C10CommissionEmployee("Sue", "Jones", "333-33-333", 10000, .06, 
                    new C08Date(1, 1, 1));
        C10BasePlusCommissionEmployee basePlusCommissionEmployee =
            new C10BasePlusCommissionEmployee(
                "Bob", "Lewis", "444-44-444", 5000, .04, 300, 
                    new C08Date(1, 1, 1));
        
        C10Employee[] employees = new C10Employee[4];
        
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        
        System.out.println("Employees processados poliformicamente:");
        
        // processa genericamente cada elemento de employees
        for(C10Employee currentEmployee : employees){
            System.out.println(currentEmployee);
            
            // determina se o elemento é um basePlusEmployee
            if (currentEmployee instanceof C10BasePlusCommissionEmployee){
                
                // downcast da referência de employee para
                // referência de C10BasePlusCommissionEmployee
                C10BasePlusCommissionEmployee employee = 
                        (C10BasePlusCommissionEmployee) currentEmployee;
                
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                
                System.out.printf(
                        "Novo baseSalary com acréscimo de 10%% é: R$%,.2f%n",
                        employee.getBaseSalary());
            }
            
            System.out.printf("earned: R$%,.2f%n%n", currentEmployee.getPaymentAmount());
        }
        
        // obtém o tipo de cada objeto no array employees
        for(int i = 0; i < employees.length; i++){
            System.out.printf("Employee %d is a %s%n", i,
                    employees[i].getClass().getName());
        }
    }
}
