package com.example;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import com.google.common.collect.ImmutableList;
public class App 
{
    // Main method - program execution starts from here
    public static void main( String[] args )
    {
        // Create an immutable list of strings (fruits)
        // This list cannot be changed (no add/remove allowed)
        ImmutableList<String> fruits = ImmutableList.of("Apple", "Banana", "Cherry");
        
        // Print the list of fruits to the console
        System.out.println(fruits);
        
        // Create a File object representing the source file
        File sourceFile = new File("source.txt");
        
        // Create a File object representing the destination file
        File destFile = new File("destination.txt");

        try {
            // Copy the contents of source.txt to destination.txt
            // Using Apache Commons IO FileUtils class
            FileUtils.copyFile(sourceFile, destFile);
            
            // Print success message if file is copied
            System.out.println("File copied successfully!");
        } 
        catch (IOException e) {
            // If any error occurs during file copying,
            // this block will handle the exception
            
            // Print error message
            System.err.println("Error occurred while copying file: " + e.getMessage());
        }
    }
}
