package ProcessingFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Application_2 {
    public static void main(String[] args) throws IOException {
        File file_in = new File("src\\ProcessingFiles\\sample.txt");
        FileReader file_reader = new FileReader(file_in);
        BufferedReader file_buffreader =  new BufferedReader(file_reader);
        String line = file_buffreader.readLine();
        while (line != null){
            System.out.println(line);
            line = file_buffreader.readLine();
        }
        file_buffreader.close(); 
    }
}
