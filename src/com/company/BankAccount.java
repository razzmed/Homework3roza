package com.company;

public class BankAccount {
    double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public BankAccount() {
    }

    public double getAmount() {
        return amount;
    }

    public int withDraw(int sum) throws LimitException {
        amount = amount - sum;
        System.out.println("К выдаче: " + sum);
        if (sum > amount) {
            throw new LimitException("У вас недостаточно средств", getAmount());
        }
        return sum;
    }

    public double deposit(double sum) {
        amount = amount + sum;
        System.out.println("Поступили средства в сумме: " + sum);
        return sum;
    }
}
