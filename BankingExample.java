/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingexample;

import java.util.*;

class Account{
    private int balance;
    private String password;  
    
    public void withdraw(int amount){
        
        Scanner sc=new Scanner(System.in);
        String pw=sc.nextLine();
        
        if(pw==password){
          balance-=amount; 
          System.out.println("Your updated balance is : "+balance);
        }
        else
            System.out.println("Please Enter a valid password ");
        
        
    }
    public void deposit(int amount){
        balance+=amount;
        System.out.println("Your updated balance is : "+balance);
    }
    public void setPassword(String p){
     password=p;
    }
    public void checkBalance(){
        
        System.out.println("Enter your Password: ");
        Scanner scanner = new Scanner(System.in);
        String pw = scanner.nextLine(); 
        System.out.println("PW is : "+pw+" and Password is : "+password);
        
        if(pw.equals(password)){
          System.out.println("Your account balance is : "+balance);
        }
        else
            System.out.println("Please Enter a valid password ");
    }
}


public class BankingExample {

    
    public static void main(String[] args) {
        Account A=new Account();
        A.setPassword("12345");
       
        A.checkBalance();
        
       
    }
    
}

