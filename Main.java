import java.util.Scanner;


public class Main  {

    public static Scanner sc = new Scanner(System.in);

    public static void showmenu(){
        while(true){
            System.out.println("*******Banking System*******");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display all Accounts");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                    case 1 -> Bank.creatAc();
                    case 2 -> Bank.depositToAc();
                    case 3 -> Bank.withdrawFromAc();
                    case 4 -> Bank.displayAllAccounts();
                    case 5 -> System.exit(0);
                }
            }
        }

    public static void main(String[] args) {
            showmenu();
        }
    }
