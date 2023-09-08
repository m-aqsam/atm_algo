import java.util.Scanner;

/*
  Print the average of three numbers entered 
  by user by creating a class named 'Average'having a method 
  to calculate and print the average.

  */

class Average {
    Scanner sc = new Scanner(System.in);
    public static int num;

    public void display() {
        System.out.println("How many numbers do yo want to Enter ");
        num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println("Enter " + i + " number");
            int userint = sc.nextInt();
            sum = sum + userint;
        }

        int Average = sum / num;
        System.out.println("Average of " + num + " numbers is " + Average);
    }

}

/*
 * Create a class Account class with balance as data member.
 * Create two constructors (no argument, and two arguments)
 * and methods to withdraw and deposit balance.
 * 
 */

class Account {
    Scanner sc = new Scanner(System.in);

    int Balance = 0;
    public static int num;

    public Account() {
        System.out.println("What you want to do 1:[Deposit Balance] or 2:[Withdraw Balance]");
        System.out.println("Enter 1 for Deposit and 2 for Withdraw");

        int num = sc.nextInt();

        if (num == 1) {
            deposit();
        } else if (num == 2) {
            withdraw();
        } else {
            System.out.println("you can enter only 1 or 2");
        }
    }

    public void deposit() {
        System.out.println("How much you want to Deposit ");
        int dep = sc.nextInt();
        Balance = Balance + dep;
        System.out.println("You Deposit " + dep + " in your Account ");
        System.out.println("Your Balance is " + Balance);

        System.out.println("1:[Withdraw] or 2:[Exit] ");
        int choose = sc.nextInt();
        if (choose == 1) {
            withdraw();
        } else {
            System.out.println("You Exited the Program");
        }

    }

    public void withdraw() {
        System.out.println("Tip : Please Recharge your Account ");
        System.out.println("Your Available Balance is " + Balance);
        System.out.println("Enter 1 for [Withdraw] and 2 for [Deposit]");

        int select = sc.nextInt();
        if (select == 1) {
            System.out.println("How much you want to Withdraw");
            int how_much = sc.nextInt();
            if (how_much <= Balance) {
                System.out.println("You withdraw " + how_much + " Balance");
                System.out.println("Remaining Balance is " + (Balance - how_much));
            } else {
                System.out.println("Sorry !! Balance not Available ");
            }

        } else if (select == 2) {
            deposit();
        } else {
            System.out.println("Please only select 1 or 2 ");
        }

    }

}

public class AtmAlgorithm {
    public static void main(String[] args) {
        // Average obj1 = new Average();
        // obj1.display();

        Account obj1 = new Account();

    }
}
