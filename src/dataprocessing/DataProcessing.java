/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dataprocessing;

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
        DataInputInterface dataInput;
        DataOutputInterface dataOutput;
        
        ArrayList<String> validatedData = dataInput.getAndValidateAllData();
        dataOutput.outputAllData(validatedData);

    }
    
}
