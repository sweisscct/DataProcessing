/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dataprocessing;

import DataInputClasses.ConsoleInput;
import DataOutputClasses.FileOutput;
import Interfaces.DataOutputInterface;
import Interfaces.DataInputInterface;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
        
        DataInputInterface dataInput = new ConsoleInput();
        DataOutputInterface dataOutput = new FileOutput();
        
        ArrayList<String> validatedData = dataInput.getAndValidateAllData();
        dataOutput.outputAllData(validatedData);
    }
    
}
