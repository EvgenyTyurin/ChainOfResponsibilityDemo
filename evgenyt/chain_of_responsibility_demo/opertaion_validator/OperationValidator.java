package evgenyt.chain_of_responsibility_demo.opertaion_validator;

import evgenyt.chain_of_responsibility_demo.operation.Operation;

public abstract class OperationValidator {

    // Correct length of account number
    static int ACCT_LENGTH = 20;

    private OperationValidator next;

    public abstract boolean check(Operation operation);

    // Set next check
    public OperationValidator linkWith(OperationValidator operationValidator) {
        next = operationValidator;
        return next;
    }

    /** Check, if ok get next check */
    public boolean validate(Operation operation) {
        if (!check(operation))
            return false;
        if (next == null)
            return true;
        return next.validate(operation);
    }

}
