import java.text.DecimalFormat; //formatting decimals
import java.text.NumberFormat; //formatting
import java.util.Scanner; //inputs
public class FrontDoor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //setup
        NumberFormat formatter = new DecimalFormat("#0.00");


        System.out.println("How much lumber do you need?"); //user inputs
        int lumber = input.nextInt();
        System.out.println("How many windows do you need??");
        int windows = input.nextInt();
        System.out.println("What is the tax rate for your area?");
        double taxes = input.nextDouble();

        ConstructionPricer house = new ConstructionPricer(11.50, 25.75, taxes);


        double cost = house.materialsCost(lumber,windows); //calculations
        cost = Math.round(cost * 100.00) / 100.00;
        cost = Double.parseDouble(formatter.format(cost));
        double costTaxed = house.totalWithTax(cost);
        costTaxed = Math.round(costTaxed * 100.00) / 100.00;
        costTaxed = Double.parseDouble(formatter.format(costTaxed));


        System.out.println("Total Materials Cost: " + cost); //final output
        System.out.println("Grand Total after Tax: " + costTaxed);
    }

}
