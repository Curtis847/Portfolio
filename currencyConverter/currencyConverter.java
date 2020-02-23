import java.util.*;
import java.text.DecimalFormat;

public class currencyConverter {
  public static void main (String[] args) {
    double amount, pound, usd, euro;
    String choice, choiceTwo;

    DecimalFormat format = new DecimalFormat("##.##");

    Scanner scan = new Scanner(System.in);

    System.out.println("This is a Currency Converter.");
    System.out.print("Please enter the type of currency you are converting from: ");
    choice = scan.nextLine();

    if (choice.equals("euro")) {
      System.out.println("Please enter the currency you wish to convert to: ");
      choiceTwo = scan.nextLine();
      if(choiceTwo.equals("pound")) {
        System.out.println("Please enter the amount you wish to convert: ");
        amount = scan.nextFloat();
        pound = amount * 0.84;
        System.out.println("Your " + amount + " euros is " + format.format(pound) + " pounds.");
      }
      else if (choiceTwo.equals("usd")) {
        System.out.println("Please enter the amount you wish to convert: ");
        amount = scan.nextFloat();
        usd = amount * 1.08;
        System.out.println("Your " + amount + " euros is " + format.format(usd) + " dollars.");
      }
      else {
        System.out.println("Invalid!");
      }

    }
    else if (choice.equals("pound")) {
      System.out.println("Please enter the currency you wish to convert to: ");
      choiceTwo = scan.nextLine();
      if(choiceTwo.equals("usd")) {
        System.out.println("Please enter the amount you wish to convert: ");
        amount = scan.nextFloat();
        usd = amount * 1.29;
        System.out.println("Your " + amount + " pounds is " + format.format(usd) + " dollars.");
      }
      else if (choiceTwo.equals("euro")) {
        System.out.println("Please enter the amount you wish to convert: ");
        amount = scan.nextFloat();
        euro = amount * 1.20;
        System.out.println("Your " + amount + " pounds is " + format.format(euro) + " euros.");
      }
      else {
        System.out.println("Invalid!");
      }
    }
    else if (choice.equals("usd")) {
      System.out.println("Please enter the currency you wish to convert to: ");
      choiceTwo = scan.nextLine();
      if(choiceTwo.equals("euro")) {
        System.out.println("Please enter the amount you wish to convert: ");
        amount = scan.nextFloat();
        euro = amount * 0.93;
        System.out.println("Your " + amount + " dollars is " + euro + " euros.");
      }
      else if (choiceTwo.equals("pound")) {
        System.out.println("Please enter the amount you wish to convert: ");
        amount = scan.nextFloat();
        pound = amount * 0.77;
        System.out.println("Your " + amount + " dollars is " + pound + " pounds.");
      }
      else {
        System.out.println("Invalid!");
      }
    }
    else {
      System.out.println("Invalid!");
    }
  }
}
