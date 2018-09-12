import java.text.NumberFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        double itemVal;
        double itemTot = 0.00;
        double totBill;
        double tax = .025;
        double taxTot;
        double tipRec = .175;
        double tipVal;
        String taxTotal;
        String itemTotal;
        String totalBill;
        String tipValue;

        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setGroupingUsed(true);
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);

        System.out.println("This program will total the cost of items entered " +
                "plus the tax of 2.5% and recommend a tip of 17.5%");
        System.out.println("Enter the value of each item or select 0 to generate the tip value.");

        Scanner userInput = new Scanner(System.in);
        int choice;


        do {
            System.out.println("1: Enter Item");
            System.out.println("0: Run Program");
            choice = userInput.nextInt();
            if (choice == 1) {
                System.out.println("Item Cost:");
                itemVal = userInput.nextDouble();

                itemTot += itemVal;

                itemTotal = nf.format(itemTot);

                System.out.println("Current Subtotal: $" + itemTotal + "\n");
            }
            if (choice != 1 && choice != 0) {
                System.out.println("That is invalid!");
            }
        }

        while (choice != 0);

        taxTot = itemTot * tax;
        totBill = (itemTot * tax) + itemTot;

        totalBill = nf.format(totBill);
        taxTotal = nf.format(taxTot);

        System.out.println("Subtotal: $" + itemTot);
        System.out.println("Tax: $" + taxTotal);
        System.out.println("Grand Total: $" + totalBill + "\n");

        tipVal = totBill * tipRec;

        tipValue = nf.format(tipVal);

        System.out.println("We recommend a 17.5% tip of: $" + tipValue);

    }
}
