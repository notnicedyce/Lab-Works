import java.util.InputMismatchException;
import java.util.Scanner;

public class Binarycon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            try {
                System.out.print("Enter the number of binary numbers to convert: ");
                int n = input.nextInt(); 
                String[] binaryNumbers = new String[n]; 
                int[] decimalNumbers = new int[n]; 

                
                for (int i = 0; i < n; i++) {
                    System.out.print("Enter binary number " + (i + 1) + ": ");
                    binaryNumbers[i] = input.next(); 
                }

                
                for (int i = 0; i < n; i++) {
                    int decimal = 0;
                    int base = 1;
                    String binary = binaryNumbers[i];

                    
                    for (int j = binary.length() - 1; j >= 0; j--) {
                        if (binary.charAt(j) == '1') {
                            decimal += base; 
                        }
                        base *= 2; 
                    }
                    decimalNumbers[i] = decimal; 
                }

                // This will print the decimal numbers
                System.out.println("Decimal numbers:");
                for (int i = 0; i < n; i++) {
                    System.out.println(decimalNumbers[i]);
                }

            
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. It must be an integer.");
                input.nextLine(); 
            }
        }

    }
}