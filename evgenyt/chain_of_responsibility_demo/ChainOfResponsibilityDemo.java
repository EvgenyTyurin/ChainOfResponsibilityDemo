package evgenyt.chain_of_responsibility_demo;

import evgenyt.chain_of_responsibility_demo.operation.Operation;
import evgenyt.chain_of_responsibility_demo.opertaion_validator.CreditValidator;
import evgenyt.chain_of_responsibility_demo.opertaion_validator.DebitValidator;
import evgenyt.chain_of_responsibility_demo.opertaion_validator.OperationValidator;
import evgenyt.chain_of_responsibility_demo.opertaion_validator.SumValidator;

/**
 * Chain of responsibility demo
 *
 * Mar 2019 Evgeny Tyurin
 *
 * Chain of financial transaction check: debit, credit, sum.
 */

public class ChainOfResponsibilityDemo {
    // Run point
    public static void main(String[] args) {
        // Create validators chain
        OperationValidator operationValidator = new DebitValidator().linkWith(new CreditValidator()).linkWith(new SumValidator());
        operationValidator.linkWith(new CreditValidator()).linkWith(new SumValidator());
        // Correct operation
        System.out.println("Check = " +
            operationValidator.validate(new Operation("42301946378291823789",
            "42345678939828492849", 100)));
        // Zero zum operation
        System.out.println("Check = " +
                operationValidator.validate(new Operation("42301946378291823789",
                        "42345678939828492849", 0)));
        // Incorrect debit acct
        System.out.println("Check = " +
                operationValidator.validate(new Operation("no acct",
                        "42345678939828492849", 100)));
    }
}
