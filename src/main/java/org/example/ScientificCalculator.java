package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScientificCalculator {

    private static final Logger logger =  (Logger) LogManager.getLogger(ScientificCalculator.class);

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        System.out.println("Enter to continue");
        scanner.nextLine();

        do {
            System.out.println("==================Scientific-Calculator===================");
            System.out.println("Please choose an operation to perform:");
            System.out.print(
                    "Enter 1 to calculate the factorial of a number\n" +
                            "Enter 2 to calculate the square root of a number\n" +
                            "Enter 3 to calculate the power of a number\n" +
                            "Enter 4 to calculate the natural logarithm of a number\n" +
                            "Enter any number other than these four to exit the program\n" +
                            "Please enter your choice: "
            );
            int input;
            try {
                input = scanner.nextInt();
            }
            catch (InputMismatchException error) {
                System.out.println("Invalid Input, please enter valid number among 1,2,3 and 4");
                scanner.close();
                return;
            }

            switch (input) {
                case 1:
                    int inputChoice1 = -1;
                    while(inputChoice1 < 0) {
                        try {
                            System.out.print("Enter a integer : ");
                            inputChoice1 = scanner.nextInt();

                            if (inputChoice1 < 0)
                                System.out.println("Sorry! I cannot calculate this as factorial for negative integers is undefined. \n Kindly enter a non-negative number :\n");
                            else
                                System.out.println("Factorial of " + inputChoice1 + " is: " + scientificCalculator.findFactorial(inputChoice1) + "\n");
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid! Please enter valid i.e. non-negative integer \n");
                        }
                        scanner.nextLine();
                    }
                    break;

                case 2:
                    double inputChoice2 = -1;
                    while(inputChoice2 < 0) {
                        try {
                            System.out.print("Enter a integer : ");
                            inputChoice2 = scanner.nextDouble();

                            if (inputChoice2 < 0)
                                System.out.println("Sorry! I cannot calculate this number's square root as for negative integers is undefined. \n Kindly enter a non-negative number :\n");
                            else
                                System.out.println("Square Root of " + inputChoice2 + " is: " + scientificCalculator.findSquareRoot(inputChoice2) + "\n");
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid! Please enter valid i.e. non-negative integer \n");
                        }
                        scanner.nextLine();
                    }
                    break;

                case 3:
                    double inputChoice3_1 = Double.POSITIVE_INFINITY;
                    double inputChoice3_2 = Double.POSITIVE_INFINITY;
                    while (inputChoice3_1 == Double.POSITIVE_INFINITY) {
                        try {
                            System.out.print("Enter a base integer : ");
                            inputChoice3_1 = scanner.nextDouble();
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid! Please enter valid i.e. numeric integer\n");
                        }
                        scanner.nextLine();
                    }
                    while(inputChoice3_2 == Double.POSITIVE_INFINITY) {
                        try {
                            System.out.print("Enter the powering entity: ");
                            inputChoice3_2 = scanner.nextDouble();
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid! Please enter valid i.e. numeric integer \n");
                        }
                        scanner.nextLine();
                    }
                    System.out.println("Power of "+ inputChoice3_1 + " to " + inputChoice3_2 + " is: " + scientificCalculator.findPower(inputChoice3_1, inputChoice3_2));
                    System.out.println("\n");
                    break;

                case 4:
                    double inputChoice4 = 0;
                    while (inputChoice4 <= 0) {
                        try {
                            System.out.print("Enter a integer : ");
                            inputChoice4 = scanner.nextDouble();

                            if (inputChoice4 <= 0)
                                System.out.println("Sorry! I cannot calculate this number's natural log as for negative integers and for zero, it is undefined. \n Kindly enter a positive number :\n");
                            else
                                System.out.println("Natural Log of " + inputChoice4 + " is: " + scientificCalculator.findNaturalLog(inputChoice4) + "\n");
                        } catch (InputMismatchException e) {
                            System.out.println("Natural Logarithm is only applicable for positive numbers");
                        }
                        scanner.nextLine();
                    }
                    break;

                default:
                    System.out.println("Thank you for choosing scientific calculator hope it helped \n");
                    scanner.close();
                    return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while (true);
    }

    public int findFactorial(int num) {
        logger.info("[Calculating factorial of: ] - " + num);

        int fact = 1;
        for(int i = 1; i <= num; i++)
            fact = fact * i;

        logger.info("[Factorial is: ] - " + fact);
        return fact;
    }

    public double findSquareRoot(double num) {
        logger.info("[Calculating the square root of: ] - " + num);
        double sqroot = Math.sqrt(num);
        logger.info("[Square root is: ] - " + sqroot);
        return sqroot;
    }

    public double findPower(double num1, double num2) {
        logger.info("[Calculating power of  - " + num1 + " to] " + num2);
        double powCal = Math.pow(num1,num2);
        logger.info("[Power is: ] - " + powCal);
        return powCal;
    }

    public double findNaturalLog(double num) {
        logger.info("[Calculating natural log of :] - " + num);
        double log = Math.log(num);
        logger.info("[Natural log is: ] - " + log);
        return log;
    }
}