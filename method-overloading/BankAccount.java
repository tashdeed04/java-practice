public class BankAccount {
  public int accNo;
  public String type;
  
  public BankAccount() {
    this.accNo = 0;
    this.type = "Not Set";
  }
  public String printDetails() {
    return "Account No: " + accNo + "\nType: " + type;
  }
    
   public void setInfo(int accNo, String type) {
        this.accNo = accNo;
        this.type = type;
        System.out.println("Account information updated!");
   }
   public void setInfo(int accNo) {
        this.accNo = accNo;
        System.out.println("Account information updated!");
    }
   public void setInfo(String type) {
        this.type = type;
        System.out.println("Account information updated!");
    }
}