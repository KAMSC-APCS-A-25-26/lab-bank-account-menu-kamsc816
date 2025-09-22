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
        System.out.println("Intial Balance = " + bAccount);

        System.out.println("What do you want to do? ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                // kjij
                System.out.println("How much do you want to add? ");
                int add = sc.nextInt();
                bAccount += add;
                break;
            case 2:
                System.out.println("How much do you want to withdraw? ");
                int sub = sc.nextInt();
                bAccount -= sub;
                break;
            case 3:
                System.out.println("Your bank account is at " + bAccount);
                break;
            case 4:
                System.out.println("You have exited the program");
                break;
        }
    }
    }
}