package com.bl.oops;
/**
 * Debit Method that provides money
 * not exceeds the amount for debit
 */
import java.util.Scanner;

public class Account {
    public static final int amount=1000;
    public void debit(){

        int withdraw,totalamount;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the money to withdraw:");
        withdraw=sc.nextInt();
        totalamount=amount-withdraw;

        //checking the debit not exceed the amount
        if(withdraw<amount && totalamount>=500){
            System.out.println("the withdraw money is:"+withdraw+"\nthe balance is"+totalamount);
        }
        else {
            System.out.println("the balance should maintain"+totalamount);
        }
    }
    public static void main(String args[]) {
        Account A=new Account();
        A.debit();
    }
}
