package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public class testException {
    public static void main(String[] args) throws FileNotFoundException {
        String filepath = "C:/Users/HP/Desktop/NEP_Final_English_0.pdf";
        readfile(filepath);

    }

    public static void readfile(String filePath) throws FileNotFoundException {
        BufferedReader reader = null;

        reader = new BufferedReader(new FileReader(filePath));
    }
}
