package evgenyt.chain_of_responsibility_demo.opertaion_validator;

import evgenyt.chain_of_responsibility_demo.operation.Operation;

public class SumValidator extends OperationValidator {

    @Override
    public boolean check(Operation operation) {
        System.out.print("Sum checking... ");
        return operation.getSum() > 0;
    }
}
