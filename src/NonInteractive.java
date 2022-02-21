import java.io.*;
import java.util.List;

public class NonInteractive extends Equation{
    public List<Double> solveEquation(String filePath) throws IOException {
        String arguments = readFile(filePath);
        int firstSpaceID = arguments.indexOf(" ");
        String tempA = arguments.substring(0, firstSpaceID);
        super.a = Double.parseDouble(tempA);
        int secondSpaceID = arguments.lastIndexOf(" ");
        String tempB = arguments.substring(firstSpaceID, secondSpaceID);
        super.b = Double.parseDouble(tempB);
        String tempC = arguments.substring(secondSpaceID, arguments.indexOf("\n"));
        super.c = Double.parseDouble(tempC);
        return solveEquation();

    }
    private String readFile(String filePath) throws IOException {
        File file = new File(filePath);
        InputStream inputStream = new FileInputStream(file);
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }

}
