package C10;

import C08.C08Date;

/**
 *
 * @author Fredson Sumi
 */
public class C10PayableInterfaceTest {
    public static void main(String[] args) {
        C10Payable[] payableObjects = new C10Payable[7];
        
        payableObjects[0] = new C10Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new C10Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] =
            new C10SalariedEmployee("john", "Smith", "111-11-1111", 800.00, 
                    new C08Date(16, 07, 2001));
        payableObjects[3] =
            new C10SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00, 
                    new C08Date(8, 12, 1986));
        payableObjects[4] =
            new C10CommissionEmployee("Sue", "Jones", "333-33-333", 10000, .06, 
                    new C08Date(28, 2, 1987));
        payableObjects[5] =
            new C10BasePlusCommissionEmployee(
                "Bob", "Lewis", "444-44-444", 5000, .04, 300, 
                    new C08Date(19, 12, 1993));
        payableObjects[6] = new C10PieceWorker(
                "Fredson", "Sumi", "555-55-555", 0.896, 2450, 
                    new C08Date(16, 7, 2001));
        
        System.out.println(
            "Invoices and Employees processed polymorphically:");
        

            for (C10Payable currentPayable : payableObjects){
                    System.out.printf("%n%s %n%s: $%,.2f%n",
                        currentPayable, 
                        "payment due", currentPayable.getPaymentAmount());
                    if(currentPayable instanceof C10BasePlusCommissionEmployee){
                        C10BasePlusCommissionEmployee employee = 
                                (C10BasePlusCommissionEmployee) currentPayable;

                        System.out.printf("Payment with 10%% bonus: %,.2f", 
                                employee.getPaymentAmount() * 1.10);
                    }
                    System.out.println("");
        }
    }
}
