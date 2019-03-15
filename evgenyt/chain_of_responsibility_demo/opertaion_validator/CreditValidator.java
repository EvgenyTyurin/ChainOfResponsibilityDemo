package evgenyt.chain_of_responsibility_demo.opertaion_validator;

import evgenyt.chain_of_responsibility_demo.operation.Operation;

public class CreditValidator extends OperationValidator {

    @Override
    public boolean check(Operation operation) {
        System.out.print("Credit checking... ");
        return operation.getCredit().length() == OperationValidator.ACCT_LENGTH;
    }
}
