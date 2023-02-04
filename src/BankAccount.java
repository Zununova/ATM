import java.util.Scanner;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    void withDraw(int sum){
        amount += sum;
    }
    void deposit (double sum) throws LimitException {

        if (amount < sum) {
            throw new LimitException("Нa вашем балансе недостаточно средств", sum);
        } else {
            amount -= sum;
            System.out.println("С вашего счета было снято " + sum);

        }
    }
}
