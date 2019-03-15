package evgenyt.chain_of_responsibility_demo.operation;

/**
 * Financial operation
 */

public class Operation {
    private String debit;
    private String credit;
    private float sum;

    public Operation(String debit, String credit, float sum) {
        this.debit = debit;
        this.credit = credit;
        this.sum = sum;
    }

    public String getDebit() {
        return debit;
    }

    public String getCredit() {
        return credit;
    }

    public float getSum() {
        return sum;
    }
}
