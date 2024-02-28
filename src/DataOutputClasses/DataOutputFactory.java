/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataOutputClasses;

import Interfaces.DataOutputInterface;

/**
 *
 * @author celeb
 */
public class DataOutputFactory {
    public static DataOutputInterface makeDataOutput(String outputType) {
        switch (outputType) {
            case "File": {
                return new FileOutput();
            }
        }
        return null;
    }
}
