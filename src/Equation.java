import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Equation {
    double a,b,c;

    public List<Double> solveEquation() throws IOException {
        ArrayList<Double> solvation = new ArrayList<>();
        double discriminant = b * b - 4 * a * c;
        double x1, x2, x;
        if (discriminant > 0) {
            System.out.println("There are 2 roots");
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            solvation.add(x1);
            solvation.add(x2);
            if (solvation.get(0) == solvation.get(1)) {
                solvation.remove(1);
                System.out.println("There is 1 root:");
            }
            return solvation;
        } else if (discriminant == 0) {
            System.out.println("There is 1 root:");
            x = -b / 2 * a;
            solvation.add(x);
            return solvation;

        } else {
            System.out.println("There are 0 roots");
            return solvation;
        }
    }
}


