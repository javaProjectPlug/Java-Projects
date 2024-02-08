import java.text.DecimalFormat; 
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // initializing Scanner as sc and DecimalFormat as decform
    DecimalFormat decform = new DecimalFormat("0.00");
    Scanner sc = new Scanner(System.in);
    
    
    final double SOCIAL_SECURITY_TAX = 0.075; // discount %
    final double STATE_TAX = 0.1; // state tax %
    final double FEDERAL_TAX = 0.28; // federal tax %
    double federalTaxAmt; // federal tax amount
    double stateTaxAmt; // state tax amount100
    double socialTaxAmt; // social security tax
    double netIncome; // final income  
    double grossIncome; // gross income

  // Gather inputs
    System.out.println("What is your gross income?");
    grossIncome = sc.nextDouble();
    
  // Calculate Social Security Tax amount
    if (grossIncome >= 58000) {
      socialTaxAmt = 58000 * SOCIAL_SECURITY_TAX;
    } else {
      socialTaxAmt = grossIncome * SOCIAL_SECURITY_TAX;
    }

  // Calculate Federal Tax Amount
    if (grossIncome > 30000) {
      federalTaxAmt = 3000 + ((grossIncome-30000) * FEDERAL_TAX);
    }  
    else {
      if (grossIncome > 3000) {
        federalTaxAmt = 3000;
      } else {
        federalTaxAmt = 0;
      }
    
    }
  // Calculate state tax amount
    stateTaxAmt = grossIncome * STATE_TAX;
    
  // Calculate net income
    netIncome = grossIncome - federalTaxAmt - stateTaxAmt - socialTaxAmt;

  // Output social Tax Amount, Federal Tax Amount, State Tax Amount, and net income of user
    System.out.println("The social security tax amount is $" + decform.format(socialTaxAmt));
    System.out.println("The federal tax amount is $" + decform.format(federalTaxAmt));
    System.out.println("The state tax amount is $" + decform.format(stateTaxAmt));
    System.out.println("The persons net income is $" + decform.format(netIncome)); 

      


    
  }
}
