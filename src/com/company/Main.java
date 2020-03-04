package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount clientAccount = new BankAccount();
        clientAccount.deposit(10000);
        while (true) {
            try {
                clientAccount.withDraw(6000);
            } catch (LimitException x) {
                System.out.println("Ваш баланс: " + clientAccount.getAmount());
                LimitException limitException = new LimitException();
                clientAccount.amount = limitException.getRemainingAmount() - limitException.getRemainingAmount();

                System.out.println(x.getMessage());
                System.out.println("Ваш баланс: " + clientAccount.getAmount());
                break;

            }
        }
    }
}