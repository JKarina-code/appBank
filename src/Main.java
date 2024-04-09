
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Jymma Mogollon";
        String account = "current";
        double balance = 20599.99;
        int option = 0;

        //Client Data
        System.out.println("*******************************");
        System.out.println("\nName:" + name);
        System.out.println("Your kind of account is " + account);
        System.out.println("Your money balance is " + balance);
        System.out.println("\n*******************************");

        //Options Menu
        String menu = """
                **Write the number of the desired option **
                1 - Check balance
                2 - Withdraw
                3 - Deposit
                9 - Go out
                """;
        Scanner scanner = new Scanner(System.in);

        //Cases
        while (option != 9) {
            System.out.println(menu);
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("The updated balance is " + balance + "$");
                case 2:
                    System.out.println("What is the balance you want to withdraw? ");
                    double valueWithDraw = scanner.nextDouble();
                    if (valueWithDraw > balance) {
                        System.out.println("Insufficient balance");
                    } else {
                        balance = balance - valueWithDraw;
                        System.out.println("Remaining balance : " + balance);
                    }
                    break;
                case 3:
                    System.out.println("What is the value you want to deposit?");
                    double valueDeposit = scanner.nextDouble();
                    balance += valueDeposit;
                    System.out.println("The updated balance is " + balance + " $");
                    break;
                case 9:
                    System.out.println("Ending the program. Thank you very much for using our services ");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}


