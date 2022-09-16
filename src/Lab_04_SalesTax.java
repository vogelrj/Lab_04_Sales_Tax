import java.text.DecimalFormat;

public class Lab_04_SalesTax {
    public static void main(String[] args) {
        double TAX_RATE = .05;
        double itemPrice = 2549.99;
        double taxAmount = itemPrice * TAX_RATE;
        double totalPrice = itemPrice + taxAmount;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("You are paying $" + df.format(taxAmount) + " sales tax on a $" + itemPrice + " item.");
        System.out.println("Your total purchase price is $" + df.format(totalPrice));
    }
}