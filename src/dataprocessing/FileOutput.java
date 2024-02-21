/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataprocessing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author celeb
 */
public class FileOutput implements DataOutputInterface {

    @Override
    public void outputAllData(ArrayList<String> data) {
        String filename = "output.txt";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            for (String line : data) {
                bw.write(line);
                bw.newLine();
            }    
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
