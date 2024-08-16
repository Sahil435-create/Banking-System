import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Bank {
    static ArrayList<Account> acc = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    //methods
    public static void creatAc(){
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your initial deposit amount");
        double deposit =  sc.nextDouble();
        sc.nextLine();
        UUID randomUUID = UUID.randomUUID();
        Account a1 = new Account(randomUUID, name , deposit);
        acc.add(a1);
        System.out.println("Account Successfully  created");

        a1.acDetails();

    }

    public static Account findAcNumber(String accountNumber){
        for(Account a : acc){
            if (a.getAcNo().toString().equals(accountNumber)){
                return a;
            }
        }
        return null;
    }

    public static void depositToAc(){
        System.out.println("Enter your A/c number");
        String accountNumber = sc.nextLine();
        Account account = findAcNumber(accountNumber);

        if(account == null){
            System.out.println("Account not found");
        }else{
            System.out.println("Enter amount to deposit");
            double amt =  sc.nextDouble();
            sc.nextLine();
            account.deposit(amt);
        }
    }

    public static void withdrawFromAc(){
        System.out.println("Enter your A/c number");
        String acNo = sc.nextLine();
        Account ac = findAcNumber(acNo);

        if(ac == null){
            System.out.println("Account not found");
        }else {
            System.out.println("Enter amount to withdraw");
            double amt = sc.nextInt();
            sc.nextLine();
            ac.withdraw(amt);
        }
    }

    public static void displayAllAccounts(){
        for(Account a : acc){
            a.acDetails();
            System.out.println("------------------");
        }
    }

}
