import java.text.NumberFormat;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1224567.891);
        System.out.println(result);
    }
}
