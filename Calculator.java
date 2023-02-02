import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char result;
        System.out.println("Selection:\nA) Author Information\nB) Integer Operation\nC) Floating Point Operation\nE) Instructional Information About This Calculator\nX) Exit\n");
        Scanner userInput = new Scanner(System.in);
        result = userInput.next().charAt(0);
        result = Character.toUpperCase(result);

        switch (result) {
            case 'A' -> System.out.println("Apollo Draco");
            case 'B' -> {
                int num1, num2;
                char operator;
                System.out.println("Enter An Equation (Example: 2 + 2)\n * Spaces Required Between Numbers And Operator: \n * Only Capable Of Calculating Two Numbers. A Third Number Or More In The Equation Will Be Ignored:");
                num1 = userInput.nextInt();
                operator = userInput.next().charAt(0);
                num2 = userInput.nextInt();
                float output;
                switch (operator) {
                    case '+' -> output = num1 + num2;
                    case '-' -> output = num1 - num2;
                    case '*', 'x' -> output = num1 * num2;
                    case '%' -> output = num1 % num2;
                    case '/' -> { output = num1 / num2;
                        if(num2 < 0) {
                            System.out.println("Divide By Zero Error");
                        }
                        else {
                            output = (float) num1 / num2;
                            System.out.printf("%f " , output);
                        }
                        System.out.print(output);
                        System.exit(0);
                    }
                    default -> {
                        System.out.print("Invalid Operator");
                        return;
                    }
                }
                System.out.println(num1 + " " + operator + " " + num2 + ": " + output);
            }
            case 'C' -> {
                char operator1;
                System.out.println("Enter An Equation (Example: 2 + 2)\n * Spaces Required Between Numbers And Operator: \n * Only Capable Of Calculating Two Numbers. A Third Number Or More In The Equation Will Be Ignored:");
                float num1 = userInput.nextFloat();
                operator1 = userInput.next().charAt(0);
                float num2 = userInput.nextFloat();
                float output1;
                switch (operator1) {
                    case '+' -> output1 = num1 + num2;
                    case '-' -> output1 = num1 - num2;
                    case '*', 'x' -> output1 = num1 * num2;
                    case '/' -> { output1 = num1 / num2;
                        if (num2 == 0) {
                            System.out.println("Divide By Zero Error");
                        } else {
                            System.out.print(output1);
                        }
                        System.exit(0);
                    }
                    default -> {
                        System.out.print("Invalid Operator");
                        return;
                    }
                }
                System.out.println(num1 + " " + operator1 + " " + num2 + ": " + output1);
            }

            case 'E' -> System.out.println("\nEnter An Equation (Example: 2 + 2)\nSupported Operators Are As Follows:\n+ , - , / , * or x , %\nDivision By Zero Will Output An 'Invalid Operator' Error\nSpaces Required Between Numbers And Operator\nOnly Capable Of Calculating Two Numbers. A Third Number Or More In The Equation Will Be Ignored\n Modulus Operation '%' Is Supported For Integer Equation Only");
            case 'X' -> System.exit(0);
        }
    }
}
