package access;

public class BankAccount {

    private int balance; // balance를 private으로 막음.

    public BankAccount() {
        balance = 0;
    }

    // public 메서드 : deposit
    public void deposit(int amount) {
        if(isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않는 금액입니다.");
        }
    }

    // public 메서드 : withdraw
    public void withdraw(int amount) {
        if(isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않는 금액이거나 잔액이 부족합니다.");
        }
    }

    public boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }

    public int getBalance() {
        return balance;
    }
}
