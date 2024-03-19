/* 
Write an algorithm and program which will prompt the user to enter 2 positive numbers: a starting and an ending number, where the starting mumber is the smaller number. Your program will then output all the numbers between the starting and ending numbers, the squares of the odd numbers and the sum of the squares of the odd numbers. Your program should be able to repeat, asking if the user wishes to run it again or quit. Make sure to use the while and do while loops, include suitable documentation and error check your program suitably. 

example output:
Input starting number: 1
Input ending number: 5
the numbers are: 1, 2, 3, 4, 5
Squares of odd numbers between 1 and 5 are: 1, 9, 25 
Sum of squares of the odd numbers between 1 and 5 is: 35
Do you wish to run the program again (1 for yes, 0 for no): 

*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int replayLoop = 1;

        while (replayLoop == 1) {
            int startingNumber;
            int endingNumber;
            int oddSquaredSum = 0;

            // get user inputs for starting and ending number
            System.out.println("Input starting number:");
            startingNumber = sc.nextInt();
            System.out.println("Input ending number:");
            endingNumber = sc.nextInt();

            // Error check for start and end val
            while (true) {
              if (!(startingNumber < endingNumber)) {
                  System.out.println("Error - starting number has to be less than ending number.");
                  System.out.println("Input starting number:" );
                  startingNumber = sc.nextInt();
                  System.out.println("Input ending number: ");
                  endingNumber = sc.nextInt();
              } else if (!(startingNumber >= 0)) {
                  System.out.println("Error - starting number must be pos");
                  System.out.println("Input starting number: ");
                  startingNumber = sc.nextInt();
              } else if (!(endingNumber >= 0)) {
                  System.out.println("Error - ending number must be pos ");
                  System.out.println("Input ending number: ");
                  endingNumber = sc.nextInt();
              } else {
                  break;
              }
          }

            // initialize var for loop and output
            int betweenNum = startingNumber;
            String betweenNumOutput = "";
            String oddSquaredOutput = "";

            // return between start and end num
            do {
                betweenNumOutput += betweenNum + " ";

                // find odd squared num and sum
                if (betweenNum % 2 != 0) {
                    int oddSquared = betweenNum * betweenNum;
                    oddSquaredOutput += oddSquared + " ";
                    oddSquaredSum += oddSquared;
                }

                betweenNum++;
            } while (betweenNum <= endingNumber);

            // outputs
            System.out.println("The numbers between " + startingNumber + " and " + endingNumber + " are: " + betweenNumOutput);
            System.out.println("Squares of odd numbers between " + startingNumber + " and " + endingNumber + " are: " + oddSquaredOutput);
            System.out.println("Sum of squares of the odd numbers between " + startingNumber + " and " + endingNumber + " is: " + oddSquaredSum);

            // loop check + error check for inputs
            int validInput = 0;
            while (validInput == 0) {
              System.out.print("Do you wish to run the program again? (1 for yes, 0 for no): ");
              replayLoop = sc.nextInt();
              if (replayLoop == 0 || replayLoop == 1) {
                  validInput = 1;
              } else {
                  System.out.println("Invalid input. Please enter either 1 or 0.");
              }
          }
        }
      System.out.println("done :> ");
    }
}
