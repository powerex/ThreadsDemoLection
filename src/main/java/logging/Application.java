package logging;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        do {

            System.out.println("Enter two operands");
            double x = reader.nextDouble();
            double y = reader.nextDouble();

            System.out.println("Enter operation");
            String operation = reader.next();

            System.out.println(operation);

            Calculator calculator = new Calculator();

            double result = switch (operation) {
                case "add" -> calculator.add(x,y);
                case "sub" -> calculator.sub(x,y);
                default -> 0;
            };

            System.out.println("Result is " + result);

            System.out.println("One more time? y/n");
            String s = reader.next();
            char exit = s.charAt(0);
            if (exit != 'y')
                break;
        } while (true);

    }

}
