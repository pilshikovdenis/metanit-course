package com.chapter3_18;

public class Transaction<T extends Account> {
    private T from;
    private T to;
    private int sum;

    Transaction(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute() {
        if (from.getSum() > sum) {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Transaction from %s to %s completed\n", from.getId(), to.getId());
        }
        else {
            System.out.printf("%s balance low then %d\n", from.getId(), sum);
        }
    }
}
