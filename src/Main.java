import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Write a sentence, and I will check if it's a Pangram or not");

        String userInput = myScanner.nextLine();

        boolean isPangram = PangramChecker.checkAllLetters(userInput);

        if (isPangram) {
            System.out.println("The input is a Pangram!");
        } else {
            System.out.println("The input is not a Pangram.");
        }

        myScanner.close();

    }
}