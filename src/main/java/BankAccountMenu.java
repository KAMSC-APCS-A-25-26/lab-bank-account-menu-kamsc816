import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bAccount = 0;

        while (true) {
        System.out.println("------Bank Account Menu------");
        System.out.println("1. Add Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.println("Initial Balance = " + bAccount);

        System.out.println("Enter your choice: ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("How much do you want to add? ");
                double add = sc.nextDouble();
                bAccount += add;
                System.out.println("Added: $" + add);
                System.out.println("New balance: $" + bAccount);
                break;
            case 2:
                System.out.println("How much do you want to withdraw? $");
                double sub = sc.nextDouble();
                System.out.println("Withdrew: $" + sub);
                if(sub>bAccount)
                {
                    System.out.println("Insufficient Funds");
                    break;
                }
                bAccount -= sub;
                System.out.println("New balance: $");
                break;
            case 3:
                System.out.println("Your bank account is at $" + bAccount);
                break;
            case 4:
                System.out.println("You have exited the program");
                break;
        }
    }
    }
}