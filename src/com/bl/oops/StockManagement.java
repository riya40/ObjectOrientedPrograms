package com.bl.oops;
/**
 * Program for Reading the stock names
 * Calculating Total Shares and Stock
 */

import java.util.Scanner;

class Stock{
    String companyname,stockname;
    int stockprice,totalshare,s,numberofshares,totalstocks,totalshares;
    Scanner  sc=new Scanner(System.in);


    //reading the stock name
    public void takingInputForCompanyNameAndStockName() {
        System.out.println("Enter company name\nEnter stockname");
        companyname=sc.next();
        stockname=sc.next();
    }


    //calculating total stocks and total shares
    public void calculatingStocksAndShares() {
        System.out.println("enter the number of stocks:");
        int stocks=sc.nextInt();
        System.out.println("enter the total number od shares:");
        numberofshares=sc.nextInt();
        for(int i=0;i<stocks;i++) {
            s=(int) Math.floor(Math.random()*10)%45;
            System.out.println("stocks are:"+s);
            totalstocks+=s;
        }
        for(int j=0;j<numberofshares;j++) {
            totalshare=numberofshares*s;
            System.out.println("shares are:"+totalshare);
            totalshares+=totalshare;
        }
    }

    //Displaying the report
    public void displayingtheStockReport() {
        System.out.println("company name:"+companyname+"\nstock name:"+stockname);
        System.out.println("the shares are"+totalshare);
        System.out.println("the total stocks are:"+totalstocks);
        System.out.println("the total shares are:"+totalshares);
    }

}
public class StockManagement {
    public static void main(String args[]) {
        Stock s=new Stock();
        s.takingInputForCompanyNameAndStockName();
        s.calculatingStocksAndShares();
        s.displayingtheStockReport();
    }

}
