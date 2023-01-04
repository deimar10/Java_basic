package week9.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Printer {
    private String fileName;
    public Printer(String fileName) {
        this.fileName = fileName;
    }
    public void printLinesWhichContain() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/week9/application/file.txt"));
            String word  = reader.readLine();

            while (word  != null) {
                if(word.contains("Väinämöinen")){
                    System.out.println(word);
                }
                word = reader.readLine();
            }

            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void printLines(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/week9/application/file.txt"));
            String line = reader.readLine();

            while (line != null) {
                    line = reader.readLine();
                    System.out.println(line);
                }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Printer printer = new Printer("src/week9/application/file.txt");

        printer.printLinesWhichContain();
        System.out.println("-----");
        printer.printLines();
    }
}
