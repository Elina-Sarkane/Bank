import controller.Bank;
import entity.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter username: ");
        String userName = myObj.nextLine();
        System.out.println("Hello " + userName + "!");

        Scanner myAccountNumber = new Scanner(System.in);
        System.out.println("Please enter your account number: ");
        String accountNumber = myAccountNumber.nextLine();
        System.out.println("Account number - " + accountNumber + " is correct!");

        Scanner myPinCode = new Scanner(System.in);
        System.out.println("Please enter your pin code: ");
        String pinCode = myPinCode.nextLine();
        System.out.println("Pin code - " + pinCode + " is correct!");

        User user = new User("1234567", "1234", 10.00, "Elīna", "FEMALE");

        Bank bank = new Bank();
        bank.setActiveUser(user);
        System.out.println("Welcome to bank " + user.name + "!");
        System.out.println("Current balance " + bank.getUserBalance());
        String response = bank.creditUser(200.50);
        System.out.println(response);
        String debitResponse = bank.debitUser(10.00);
        System.out.println(debitResponse);

        Scanner myDebit = new Scanner(System.in);
        System.out.println("How much money you want to take out? ");
        float debit = myDebit.nextFloat();

        if (debit <= 300) {
            System.out.println(debit + " You can take out your money!");
            Scanner tookOut = new Scanner(System.in);
            System.out.println("Please confirm with pin code!");
            String out = tookOut.nextLine();
            System.out.println("Pin code " + out + " is correct.");
            System.out.println("You took out " + debit + " euros.");
        } else {
            System.out.println("You don't have " + debit + " euros in your account!");
        }

        //Second user
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Enter username");
        String userName1 = myObj1.nextLine();
        System.out.println("Hello " + userName1 + "!");

        Scanner myAccountNumber1 = new Scanner(System.in);
        System.out.println("Please enter your account number: ");
        String accountNumber1 = myAccountNumber1.nextLine();
        System.out.println("Account number - " + accountNumber1);

        Scanner myPinCode1 = new Scanner(System.in);
        System.out.println("Please enter your pin code: ");
        String pinCode1 = myPinCode1.nextLine();
        System.out.println("Pin code - " + pinCode1 + " is correct!");

        User user1 = new User("7654321", "4321", 100.00, "Jimmy", "MALE");

        Bank bank1 = new Bank();
        bank1.setActiveUser(user1);
        System.out.println("Welcome to bank " + user1.name + "!");
        System.out.println("Current balance " + bank1.getUserBalance());
        String response1 = bank1.creditUser(1500.00);
        System.out.println(response1);
        String debitResponse1 = bank.debitUser(10.00);
        System.out.println(debitResponse1);

        Scanner myDebit1 = new Scanner(System.in);
        System.out.println("How much money you want to take out?");
        float debit1 = myDebit1.nextFloat();

        if (debit1 <= 1500) {
            System.out.println(debit1 + " You can take out your money!");
            Scanner tookOut1 = new Scanner(System.in);
            System.out.println("Please confirm with pin code!");
            String out1 = tookOut1.nextLine();
            System.out.println("Pin code " + out1 + " is correct.");
            System.out.println("You took out " + debit1 + " euros.");
        } else {
            System.out.println("You don't have " + debit1 + " euros in your account!");
    }
    }
}
