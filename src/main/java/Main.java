import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
      String[] fruits = {"apple", "orange", "mango"};

      for (int i = 0; i < fruits.length; i++)
          System.out.println(fruits[i]);
      for (String fruit : fruits)
          System.out.println(fruit);

    }
}
