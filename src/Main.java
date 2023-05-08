import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader fileReader = null;
            fileReader =new BufferedReader(new InputStreamReader(
                    new FileInputStream("src\\file.txt")));
            String line;
            line = fileReader.readLine();
            while ( line != null) {
                System.out.println("Введений рядок: " + line);
                StringTokenizer tokenizer = new StringTokenizer(line);
                System.out.print(" Рядок складається з: ");
                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    if (token.matches("\\d+.*")){
                        double number = Double.parseDouble(token);
                        System.out.printf("%s - це число = %f%n", token, number);
                    } else   {
                        System.out.print(token + "- це смволи чи слово; ");
                    }
                }
                System.out.println();
                line = fileReader.readLine();
            }
            fileReader.close();
        } catch (FileNotFoundException e){
            System.out.println("Файл не знайдений");
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}