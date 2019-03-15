package evgenyt.chain_of_responsibility_demo.opertaion_validator;

import evgenyt.chain_of_responsibility_demo.operation.Operation;

public class DebitValidator extends OperationValidator {

    @Override
    public boolean check(Operation operation) {
        System.out.print("Debit checking... ");
        return operation.getDebit().length() == OperationValidator.ACCT_LENGTH;
    }
}
