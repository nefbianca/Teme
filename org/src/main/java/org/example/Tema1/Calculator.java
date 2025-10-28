package org.example.Tema1;

public class Calculator {
    public static void main(String[] args) {

        float result = 0;
        boolean operationPerformed = false;

        if (args.length == 3) {
            float a = Float.parseFloat(args[0]);
            String operator = args[1];
            float b = Float.parseFloat(args[2]);

            switch (operator) {
                case "+":
                    result = a + b;
                    operationPerformed = true;
                    break;
                case "-":
                    result = a - b;
                    operationPerformed = true;
                    break;
                case "*":
                    result = a * b;
                    operationPerformed = true;
                    break;
                case "/":
                    if (b != 0) {
                        result = a / b;
                        operationPerformed = true;
                    } else {
                        System.out.println("Eroare: Nu se poate imparti la zero!");
                        return;
                    }
                    break;
            }

            if (operationPerformed) {
                System.out.println("Result is: " + result);
            } else {
                System.out.println("Eroare: Operator invalid. Foloseste +, -, * sau /");
            }

        } else {
            System.out.println("3 args are needed!");
        }
    }
}
