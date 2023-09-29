import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####.##"); // used for rounding the decimals to two decimal places
        // inputs
        System.out.println("What is the total bill?");
        double bill = scan.nextDouble();
        System.out.println("What is the percent of the tip you want to pay?");
        int tip = scan.nextInt();
        System.out.println("How many people are in your group?");
        int people = scan.nextInt();

        // calculations
        double tipAmt = bill * ((double) tip*.01);
        double totalBill = bill + tipAmt;
        double tipPerPerson = tipAmt / ((double) people);
        double totalPerPerson = (bill/((double) people) + tipPerPerson);

        //printing out
        System.out.println("The total tip amount is $" + df.format(tipAmt));
        System.out.println("The total bill, including the tip is $" +df.format(totalBill));
        System.out.println("Each person has to pay a tip of $" +df.format(tipPerPerson));
        System.out.println("The total each person has to pay is $" +df.format(totalPerPerson));

    }
}
