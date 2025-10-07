import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Scientific Calculator");
        double result, num1, num2;

        while (true) {
            System.out.print("\nEnter Operator: ");
            String userOpt = obj.next().toLowerCase();

            result = 0;
            if (userOpt.equals("sqrt") || userOpt.equals("abs") || userOpt.equals("cbrt") || userOpt.equals("exp") ||
                userOpt.equals("round") || userOpt.equals("ceil") || userOpt.equals("floor") || userOpt.equals("log") ||
                userOpt.equals("sine") || userOpt.equals("cosine") || userOpt.equals("radians") || userOpt.equals("degrees") || userOpt.equals("log10")) {

                System.out.print("Enter a number: ");
                num1 = obj.nextDouble();

                switch (userOpt) {
                    case "sqrt": result = Math.sqrt(num1); break;
                    case "abs": result = Math.abs(num1); break;
                    case "cbrt": result = Math.cbrt(num1); break;
                    case "exp": result = Math.exp(num1); break;
                    case "round": result = Math.round(num1); break;
                    case "ceil": result = Math.ceil(num1); break;
                    case "floor": result = Math.floor(num1); break;
                    case "sin": result = Math.sin(num1); break;
                    case "cos": result = Math.cos(num1); break;
                    case "log": result = Math.log(num1); break;
                    case "log10": result = Math.log10(num1); break;
                    case "degrees": result = Math.toDegrees(num1); break;
                    case "radians": result = Math.toRadians(num1); break;
                }

            } else if (userOpt.equals("+") || userOpt.equals("-") || userOpt.equals("/") || userOpt.equals("*") ||
                userOpt.equals("%") || userOpt.equals("min") || userOpt.equals("max") || userOpt.equals("pow")){
                System.out.print("Enter first number: ");
                num1 = obj.nextDouble();
                System.out.print("Enter second number: ");
                num2 = obj.nextDouble();

                switch (userOpt) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/": result = num1 / num2; break;
                    case "%": result = num1 % num2; break;
                    case "min": result = Math.min(num1, num2); break;
                    case "max": result = Math.max(num1, num2); break;
                    case "pow": result = Math.pow(num1, num2); break;
                    default:
                        System.out.println("Invalid Operator");
                        continue;
                }
            }else{
                System.out.println("Invalid Operator");
            }

            System.out.println("Result: " + result);
        }

    }
}