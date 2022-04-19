import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       final byte MONTHS_IN_YEARS = 12;
       final byte PERCENT = 100;

       Scanner scanner1 = new Scanner(System.in);

       System.out.print("Principal: ");
       int principal = scanner1.nextInt();

       System.out.print("Annual Interest Rate (%): ");
       float annualInterest = scanner1.nextFloat();
       float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS;

        System.out.print("Period (Years): ");
        int periodYear = scanner1.nextInt();
        int periodMonth = periodYear*12;



    }
}
