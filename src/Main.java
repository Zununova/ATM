import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount  bankAccount = new BankAccount();
        bankAccount.withDraw(20000);
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("На вашем счету " + bankAccount.getAmount());
            System.out.println("Введите сумму");

            int sum =scanner.nextInt();
            try {
                bankAccount.deposit(sum);
            } catch (LimitException e) {
                throw new RuntimeException(e);
            }

        }

    }
}