//importing Scanner and Decimal Format
import java.text.DecimalFormat; 
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // initializing Scanner as sc and DecimalFormat as decform
    DecimalFormat decform = new DecimalFormat("0.00");
    Scanner sc = new Scanner(System.in);
    
    
    final double DISCOUNT_AMOUNT = 0.12; // discount %
    final double SALES_TAX = 0.1; // sales tax %
    double finalCarPrice; // final car price 
    double carPrice; // car price given by user

    //gathering input of car price from user
    System.out.println("What is the price of the car?");
    carPrice = sc.nextDouble();

    //calculating final car price
    finalCarPrice = ((carPrice - (carPrice * DISCOUNT_AMOUNT)) * (1 + SALES_TAX));

    
    //output final car price
  System.out.println("The sales tax is " + decform.format(((carPrice - (carPrice * DISCOUNT_AMOUNT)) * SALES_TAX)) + ". The discount amount is " + decform.format((DISCOUNT_AMOUNT * carPrice)) + ", and the final price of the car is $" + decform.format(finalCarPrice)); 
    
    
  }
}
