package interfaces;

import java.io.File;
import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShortLister{
    public static void main(String[] args){
        JFileChooser chooser = new JFileChooser();

        int result = chooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION){
            File selectedFile = chooser.getSelectedFile();

            Filter filter = new ShortWordFilter();

            try{
                Scanner input = new Scanner(selectedFile);

                System.out.println("Short words (length < 5):");
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");

                while (input.hasNext()){
                    String word = input.next();

                    if (filter.accept(word)){
                        System.out.println(word);
                    }
                }

                input.close();
            }
            catch (FileNotFoundException e){
                System.out.println("File was not found!");
            }
        }
        else{
            System.out.println("No file selected!");
        }
    }
}