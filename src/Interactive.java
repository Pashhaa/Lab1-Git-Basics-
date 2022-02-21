import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Interactive extends Equation {
    boolean isCorrect = false;
    public List<Double> solveEquation() throws IOException {
        try {
            System.out.println("Please, type a,b,c arguments");
            System.out.print("a = ");
            super.a = argsInput();
            System.out.print("b = ");
            super.b = argsInput();
            System.out.print("c = ");
            super.c = argsInput();
            System.out.println("Equation is:" + "(" + a + ")" + "x^2" + "+" + "(" + b + ")" + "x" + "+" + "(" + c + ")");
            return solveEquation();
        } catch (Exception e) {
            System.out.println("Error. Expected a valid real number, try again, please");

        }
        throw new IOException("Error,expect real number");
    }
    private double argsInput() throws IOException {
        double arg = 0;
        Scanner scanner = new Scanner(System.in);
        while (!isCorrect) {
            String input = scanner.nextLine();
            Double temp = doubleParser(input);
            if (isCorrect) {
                arg = temp;
                isCorrect = false;
                return arg;
            } else {
                System.out.println("Error. Expected a valid real number, got " + input + " instead");
                System.out.println("Try again please");
            }
        }
        throw new IOException("Error. Expected a valid real number");
    }

    private double doubleParser(String line) {
        double result = 0;
        try {
            result = Double.parseDouble(line);
            isCorrect = true;
        } catch (NumberFormatException e) {
            isCorrect = false;
        }
        return result;
    }
}
