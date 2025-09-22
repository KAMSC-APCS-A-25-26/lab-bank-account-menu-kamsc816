import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bAccount = 0;
    while(true)
    {
        System.out.println("------Bank Account Menu------");
        System.out.println("1. Add Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        System.out.println("What do you want to do? ");
        int num = sc.nextInt();

        if(num==1)
        {
            System.out.println("How much do you want to add? ");
            int add = sc.nextInt();
            bAccount += add;
        }
        if(num==2)
        {
            System.out.println("How much do you want to withdraw? ");
            int sub = sc.nextInt();
            bAccount -= sub;
        }
        if(num==3)
        {
            System.out.println("Your bank account is at " + bAccount);
        }

        if(num==4)
        {
            System.out.println("You have exited the program");
        }
    }
    }
}