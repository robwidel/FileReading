package common.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String FILE_DIR = "src\\common\\filehandling\\points.txt";
//        File file1 = new File( FILE_DIR);
//
//        try {
//            file1.createNewFile();
//            System.out.println("File created");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        char[] someText = new char[100];

        try(FileReader pointsReader = new FileReader(FILE_DIR)) {
            pointsReader.read(someText);
            System.out.println(someText);
            pointsReader.read(someText);
            System.out.println(someText);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}