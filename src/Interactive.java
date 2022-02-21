import java.util.Scanner;

public class Interactive extends Equation {
    public void interactSolve() {
        try {
            System.out.println("Please, type a,b,c arguments");
            System.out.print("a = ");
            Scanner scanner = new Scanner(System.in);
            super.a = scanner.nextDouble();
            scanner = new Scanner(System.in);
            System.out.print("b = ");
            super.b = scanner.nextDouble();
            scanner = new Scanner(System.in);
            System.out.print("c = ");
            super.c = scanner.nextDouble();
            System.out.println("Equation is:" + "(" + a + ")" + "x^2" + "+" + "(" + b + ")" + "x" + "+" + "(" + c + ")");
            System.out.println(solveEquation());
        } catch (Exception e) {
            System.out.println("Error. Expected a valid real number, try again, please");
            Interactive newTry = new Interactive();
            newTry.interactSolve();
        }


    }
}
