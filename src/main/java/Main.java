import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isElible = (hasGoodCredit || hasHighIncome) && !hasCriminalRecord;
        System.out.println(isElible);


    }
}
