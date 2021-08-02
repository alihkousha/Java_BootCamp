package ProcessingFiles;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println(input());
        String[] lines =  open("src\\ProcessingFiles\\sample.txt");
        int x = 0;
        while (x < lines.length){
            System.out.println(lines[x]);
            x+=1;
        }
    }
    public static String input(){
        Scanner input = new Scanner(System.in);
        String enterdString = input.nextLine();
        input.close();
        return enterdString;
    }
    public static String[] open(String path) throws FileNotFoundException {
        File file_in = new File(path);
        Scanner file_text = new Scanner(file_in);
        int lines_count = 0;
        while(file_text.hasNextLine()){
            file_text.nextLine();
            lines_count += 1;
        }
        file_text.close();

        File file_in_2 = new File(path);
        Scanner file_text_2 = new Scanner(file_in_2);
        String [] lines_list = new String[lines_count];
        int lines_count_2 = 0;
        while(file_text_2.hasNextLine()){
            String line = file_text_2.nextLine();
            lines_list[lines_count_2] = line;
            lines_count_2 += 1;
        }
        file_text_2.close();
        return lines_list;
    }
}
