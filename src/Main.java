import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 1) {
            NonInteractive noninteract = new NonInteractive();
            System.out.println(noninteract.solveEquation(args[0]));

        } else {
            Interactive interact = new Interactive();
            System.out.println(interact.solveEquation());
        }

    }
}
