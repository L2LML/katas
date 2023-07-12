import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int rows = 20;
    static char[] seats = {'A', 'B', 'C', 'D', 'E', 'F'};
    static String[] snacksOffered = {"Pretzels", "Chips", "Mint"};

    public static void main(String[] args) {
        System.out.println("Airline snacks.");
        String[][] snacksServed = new String[rows][seats.length];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats.length; j++) {
                System.out.println("Seat " + (i + 1) + seats[j]);
                System.out.println("Choose snack: " + Arrays.toString(snacksOffered));
                //                String snackSelected = input.nextLine();
                String snackSelected = "X";
                snacksServed[i][j] = snackSelected;
            }
        }

        for (int i = 0; i < rows; i++) {
            System.out.print("Row " + (i + 1) + " ");
            for (int j = 0; j < seats.length; j++) {
                System.out.print(snacksServed[i][j] + " ");
            }
            System.out.println();
        }

    }
}