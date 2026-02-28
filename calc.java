import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("---- Scientific Calculator ----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Square Root");
            System.out.println("7. Log (base 10)");
            System.out.println("8. Sin");
            System.out.println("9. Cos");
            System.out.println("10. Tan");
            System.out.println("11. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            if(choice == 11) {
                System.out.println("Calculator Closed.");
                break;
            }

            double num1, num2, result = 0;

            switch(choice) {
                case 1:
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = num1 + num2;
                    break;

                case 2:
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = num1 - num2;
                    break;

                case 3:
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = num1 * num2;
                    break;

                case 4:
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    if(num2 != 0)
                        result = num1 / num2;
                    else {
                        System.out.println("Cannot divide by zero");
                        continue;
                    }
                    break;

                case 5:
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = Math.pow(num1, num2);
                    break;

                case 6:
                    num1 = sc.nextDouble();
                    result = Math.sqrt(num1);
                    break;

                case 7:
                    num1 = sc.nextDouble();
                    result = Math.log10(num1);
                    break;

                case 8:
                    num1 = sc.nextDouble();
                    result = Math.sin(Math.toRadians(num1));
                    break;

                case 9:
                    num1 = sc.nextDouble();
                    result = Math.cos(Math.toRadians(num1));
                    break;

                case 10:
                    num1 = sc.nextDouble();
                    result = Math.tan(Math.toRadians(num1));
                    break;

                default:
                    System.out.println("Invalid Choice");
                    continue;
            }

            System.out.println("Result: " + result);
        }
    }
}
