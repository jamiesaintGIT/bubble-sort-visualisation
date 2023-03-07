import java.util.Scanner;

public class ArrayToVisualise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numIntegers = 0;
        boolean validInput = false;
        while (!validInput){
            System.out.print("How many integers would you like to enter [1:50]: ");
            try {
                numIntegers = scanner.nextInt();
                if (numIntegers >= 1 && numIntegers <= 50){
                    validInput = true;
                } else {
                    System.out.println("Invalid Input");
                    System.out.print("Enter an integer between 1 and 50: ");
                }

            } catch (java.util.InputMismatchException e){
                System.out.println("Invalid Input");
                System.out.print("Please enter an integer between 1 and 50: ");
                scanner.nextLine();
            }
        }

        int[] array = new int[numIntegers];

        for (int i = 0; i < numIntegers; i++){
            validInput = false;
            while(!validInput){
                System.out.print("Enter an integer between 0 and 100: ");
                try {
                    int num = scanner.nextInt();

                    if (num >= 0 && num <= 100){
                        array[i] = num;
                        validInput = true;
                    } else {
                        System.out.println("Invalid Input");
                        System.out.print("Enter an integer between 0 and 100: ");
                    }
                } catch (java.util.InputMismatchException e){
                    System.out.println("Invalid Input");
                    System.out.print("Please enter an integer between 0 and 100: ");
                    scanner.nextLine();
                }
            }
        }
        System.out.println("\n...VISUALISING...");
        BubbleSortVisualisation.runProgram(array);
        System.out.println("\nVISUALISATION COMPLETE\n");
        scanner.close();
    }
}
