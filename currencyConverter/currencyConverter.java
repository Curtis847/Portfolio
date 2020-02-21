import java.util.*;
import java.text.DecimalFormat;

public class currencyConverter {
  public static void main (String[] args) {
    double amount, pound, usd, euro;
    String choice;

    DecimalFormat format = new DecimalFormat("##.##");

    Scanner scan = new Scanner(System.in);

    System.out.println("This is a Currency Converter.");
    System.out.print("Please enter the type of currency you are converting from: ");
    choice = scan.nextLine();

    if (choice.equals("euro")) {
      System.out.println("Please enter the amount you wish to convert: ");
      amount = scan.nextFloat();
      pound = amount * 0.84;
      System.out.println("Your " + amount + " euros is " + format.format(pound) + " pounds.");
    }
    else if (choice.equals("pound")) {
      System.out.println("Please enter the amount you wish to convert: ");
      amount = scan.nextFloat();
      usd = amount * 1.29;
      System.out.println("Your " + amount + " pounds is " + format.format(usd) + " dollars.");
    }
    else if (choice.equals("usd")) {
      System.out.println("Please enter the amount you wish to convert: ");
      amount = scan.nextFloat();
      euro = amount * 0.93;
      System.out.println("Your " + amount + " dollars is " + euro + " euros.");
    }
    else {
      System.out.println("Invalid!");
    }
  }
}
