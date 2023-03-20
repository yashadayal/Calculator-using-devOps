package org.example;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(1);
        ScientificCalculator cal = new ScientificCalculator();
        cal.runService();
    }
}
