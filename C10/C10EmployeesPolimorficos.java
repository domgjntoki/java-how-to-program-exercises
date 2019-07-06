package C10;

import C08.C08Date;

/**
 *
 * @author Fredson Sumi
 */
public class C10EmployeesPolimorficos {
    // Salaried, Hourly, PieceWorker, Commission, BasePlusCommission
    public static void main(String[] args) {
        C10SalariedEmployee salariedEmployee = 
            new C10SalariedEmployee("John", "Smith", "111-11-111", 800.00, 
                    new C08Date(12, 4, 1969));
        C10HourlyEmployee hourlyEmployee = 
            new C10HourlyEmployee("Karen", "Price", "222-22-222", 16.75, 40,
                new C08Date(15, 10, 1982));
        C10CommissionEmployee commissionEmployee =
            new C10CommissionEmployee("Sue", "Jones", "333-33-333", 10000, .06, 
                    new C08Date(28, 2, 1987));
        C10BasePlusCommissionEmployee basePlusCommissionEmployee =
            new C10BasePlusCommissionEmployee(
                "Bob", "Lewis", "444-44-444", 5000, .04, 300, 
                    new C08Date(19, 12, 1993));
        C10PieceWorker pieceWorker = new C10PieceWorker(
                "Fredson", "Sumi", "555-55-555", 0.896, 2450, 
                    new C08Date(16, 7, 2001));
        
        C10Employee[] employees = {salariedEmployee, hourlyEmployee, 
                commissionEmployee, basePlusCommissionEmployee, pieceWorker};
        
        for(C10Employee employee : employees){
            System.out.println(employee);
            System.out.printf("earnings: R$ %,.2f%n%n", 
                    employee.getPaymentAmount());
        }
    }
}
