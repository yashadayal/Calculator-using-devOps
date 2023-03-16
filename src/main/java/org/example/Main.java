package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {

    private static final Logger logger =  (Logger) LogManager.getLogger(Main.class);

    public void fun()
    {
        int number = 1;
        logger.info("[FACTORIAL] - " + number);
        System.out.println("Inside fun function");
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main m = new Main();
        m.fun();
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first number- ");
        int a= sc.nextInt();
        System.out.println("Number is  " +a);
    }
}