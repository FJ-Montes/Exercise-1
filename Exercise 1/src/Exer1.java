import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("-------------------");
            System.out.println("Triangle Calculator");
            System.out.println("1. Calculate Hypotenuse");
            System.out.println("2. Calculate Area");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        calculateHypotenuse(scanner);
                        break;
                    case 2:
                        calculateArea(scanner);
                        break;
                    case 3:
                        exit = true;
                        System.out.println("Program Terminated");
                        break;
                    default:
                        System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer choice.");
                scanner.nextLine(); // Clear the input buffer
            }
        }

        scanner.close();
    }
    private static void calculateHypotenuse(Scanner scanner) {
        System.out.println("\nCalculate Hypotenuse");
        System.out.println("--------------------");
        System.out.print("Enter the length of side A: ");
        double sideA = scanner.nextDouble();
        
        System.out.print("Enter the length of side B: ");
        double sideB = scanner.nextDouble();
        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("The hypotenuse length is: " + df.format(hypotenuse));
    }

    private static void calculateArea(Scanner scanner) {
        System.out.println("\nCalculate Area");
        System.out.println("--------------");
        System.out.print("Enter the base length: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("The area of the triangle is: " + df.format(area));
    }

}
