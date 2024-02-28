/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dataprocessing;

import DataInputClasses.ConsoleInput;
import DataInputClasses.DataInputFactory;
import DataInputClasses.FileInput;
import DataOutputClasses.FileOutput;
import Interfaces.DataOutputInterface;
import Interfaces.DataInputInterface;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author celeb
 */
public class DataProcessing {

    /**
     * @param args the command line arguments
     */
    
    /*
    Given a file
    Read all the data 
    Validate it
    Output data
    */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
//        int[] numbers = {3, 6, 2, 56, 34, 4};
        
        /*
        number = 3
         loop
        number = 6
            loop
        number = 2
            loop
        */
        
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//        
//        for (int number=0; number < numbers.length; number++) {
//            System.out.println(numbers[number]);
//        }
        String inputType;
        boolean validOption = false;
        
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("How would you like to import the data?");
            System.out.println("1: Via the console");
            System.out.println("2: From a file");
            System.out.println("Enter \"Exit\" to exit");
            String userInput = sc.nextLine();
            inputType = "none";
            if (userInput.equals("Exit")) {
                System.out.println("Goodbye");
                System.exit(0);
            }
            try {
                int optionNum = Integer.parseInt(userInput);
                if (optionNum == 1) {
                    inputType = "Console";
                    validOption = true;
                } else if (optionNum == 2) {
                    inputType = "File";
                    validOption = true;
                } else {
                    System.out.println("Please select a valid number");
                    inputType = "none";
                }
                
            } catch (Exception e) {
                System.out.println("Please enter a number or \"Exit\"");
                inputType = "none";
            }
        } while (!validOption);
        
        
        
        DataInputInterface dataInput = DataInputFactory.makeDataInput(inputType);
        DataOutputInterface dataOutput = new FileOutput();
        
        ArrayList<String> validatedData = dataInput.getAndValidateAllData();
        dataOutput.outputAllData(validatedData);
    }
    
}
