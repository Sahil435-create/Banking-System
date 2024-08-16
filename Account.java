import java.util.UUID;

public class Account {
    private UUID acNo;
    private String acName;
    private double acBal;

    public Account(UUID acNo,String acName, double acBal) {
        this.acNo = acNo;
        this.acName = acName;
        this.acBal = acBal;
    }
    public UUID getAcNo() {
        return acNo;
    }

    public void setAcNo(UUID acNo) {
        this.acNo = acNo;
    }

    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName;
    }

    public double getAcBal() {
        return acBal;
    }

    public void setAcBal(double acBal) {
        this.acBal = acBal;
    }

    public void deposit(double amt) {
        if(amt > 0){
            acBal += amt;
            System.out.println("Deposit Successful. Your Balance is: "+acBal);
        }else{
            System.out.println("Invalid Amount");

        }
    }

    public void withdraw(double amt){
        if(amt > 0 && amt<=acBal){
            acBal -=amt;
            System.out.println("Withdraw successful. Your Balance is: "+acBal);
        }else{
            System.out.println("Withdraw Unsuccssfull");
        }
    }

    public void checkBalance(){
        System.out.println("Your Account Balance is: "+acBal);
    }

        public void acDetails(){
        System.out.println("Your acNo is: "+ acNo );
        System.out.println("Your acName is: "+acName);
        System.out.println("Your acBal is: "+acBal);
        }


}
