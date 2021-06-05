/*
* UCF COP3330 Summer 2021 Assignment Solution
* Copyright 2021 Dillon Flaschner
* */

package base;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String euroString = myApp.euroInput();
        String exchangeRateString = myApp.exchangeInput();

        int euros = Integer.parseInt(euroString);
        float exchangeRate = Float.parseFloat(exchangeRateString);

        float convertedDollars = myApp.convertEuro(euros, exchangeRate);

        String output = myApp.buildOutput(euroString, exchangeRateString, convertedDollars);

        myApp.printOutput(output);
    }

    public String euroInput() {
        System.out.print("How many euros are you exchanging? ");
        return input.nextLine();
    }

    public String exchangeInput() {
        System.out.print("What is the exchange rate? ");
        return input.nextLine();
    }

    public float convertEuro(int euros, float exchangeRate) {
        return euros * exchangeRate;
    }

    public String buildOutput(String euroString, String exchangeRateString, float convertedDollars) {
        String convertedString = String.format("%.2f", convertedDollars);
        return euroString + " euros at an exchange rate of " + exchangeRateString + " is \n" + convertedString + " U.S. dollars.";
    }

    public void printOutput(String output) {
        System.out.println(output);
    }
}
