package com.sparta.nam.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args){

        //java.nio
        //java.io
        String myPathString = "src/main/resources/Todo.txt";
        System.out.println("Read all lines using nio");
        List<String> result = readNioAllLines(myPathString);
        for(String line : result){
            System.out.println(line);

        }
        System.out.println("");
        System.out.println("Read all lines using io");
        readLineByLineNio(myPathString);


        // Writing files
        System.out.println("");
        System.out.println("Writing files with nio");
        String myOutputPathString = "src/main/resources/output.txt";
        var wonderwall = "And after all, you're my Wonderwall";
        writeNio(myOutputPathString, wonderwall);
    }


    private static void writeNio(String myOutputPathString, String text){
        // Write code here
        // Get this method to write the wonderwall lyric
        // to the myOutputPathString path
    }
    // readAllLines from nio returns a List of Strings
    private static List<String> readNioAllLines(String pathString) {
        List<String> readLines =null;
        Path path = Paths.get(pathString);
        try {
            readLines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return readLines;
    }

    private static void readLineByLineNio(String pathString) {
        String line;
        BufferedReader reader = null;
        try {
            reader = Files.newBufferedReader(Paths.get(pathString));
            while ((line = reader.readLine()) != null) {
                // do something with line - here we will just print it out
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
