

class bankAccount {
     
     String bankHolderName;
     private String accountNumber;
     double balance;
     
     bankAccount(String name , String account , double initialAmount){
         bankHolderName = name;
         accountNumber = account;
         balance = initialAmount;
     }

    // getter
        String getAccountNumber() {
            return accountNumber;
        }
     
     void deposit(double amount){
         balance += amount;
         System.out.println("Deposited Amount: " + balance);
     }
     
     void withDraw(double amount){
         
         if(amount<=balance){
             balance -= amount;
             System.out.println("Withdraw Amount: " + amount);
         }else{
             System.out.println("Insufficient Balance");
         }
     }
     
     void displayDetails(){
         System.out.println("Account Holder Name: " + bankHolderName );
         System.out.println("Account Number: " + getAccountNumber());
         System.out.println("Balance in account: " + balance);
     }

    
    
    public static void main(String[] args) {
        bankAccount acc = new bankAccount("Ashish" , "4515461264",10000);
        acc.deposit(2000);
        acc.withDraw(500);
        acc.displayDetails();
    }
    
    
    
    
    
    
    
    
}