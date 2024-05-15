//import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) {
        String inputFilePath = "D:\\input_file.txt";  
        String outputFilePath = "D:\\output_file.txt";
        // File file =new File(inputFilePath);
        // System.out.println("file size "+file.length());
  
        replaceVowelsWithX(inputFilePath,outputFilePath);
    }

    private static void replaceVowelsWithX(String inputFilePath, String outputFilePath) {
        try (FileReader reader = new FileReader(inputFilePath);
             FileWriter writer = new FileWriter(outputFilePath)) {
 
            int charCode;
            while ((charCode = reader.read()) != -1) {
                char currentChar =(char) charCode;             
                currentChar = (char) (isVowel(currentChar)?'x':currentChar);
                writer.write(currentChar);
            }
            System.out.println("Vowels replaced successfully");

        } catch (IOException e) {
            System.err.println("error" + e.getMessage());
        }
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
