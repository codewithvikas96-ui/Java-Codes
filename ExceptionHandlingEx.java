// Q WAJP to handle insufficient balance exception while withdrawing the amount from account

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    
    InsufficientBalanceException(String message){
        super(message);
    }
}

class Account {
    
    double balance;
    
    Account(double balance){
        this.balance = balance;
    }
    
    void withdraw(double amount) throws InsufficientBalanceException{
        
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient Balance!");
        }
        else{
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        }
    }
}

public class ExceptionHandlingEx {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Account Balance: ");
        double balance = sc.nextDouble();
        
        Account acc = new Account(balance);
        
        System.out.print("Enter Amount to Withdraw: ");
        double amount = sc.nextDouble();
        
        try{
            acc.withdraw(amount);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }
}
