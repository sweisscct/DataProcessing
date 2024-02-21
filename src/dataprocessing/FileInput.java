/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataprocessing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author celeb
 */
public class FileInput implements DataInputInterface {
    String filename = "file.txt";
    
    @Override
    public ArrayList<String> getAndValidateAllData() {
        ArrayList<String> data = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            DataValidationInterface validator = new DummyValidator();
            
            String line;
            while ( (line=br.readLine()) != null ) {
                if (validator.validateLine(line)) {
                    data.add(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}

