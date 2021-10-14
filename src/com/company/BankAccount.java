package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount = amount + sum;

    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Вы не можете снять  наличные, так как вы  хотите снять больше чем у вас есть ", amount);
        } else {
            amount -= sum;
            System.out.println("Вы сняли " + sum +
                    "\n У вас осталось:" + getAmount());
        }
    }

}
