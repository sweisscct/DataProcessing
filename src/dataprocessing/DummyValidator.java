/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataprocessing;

/**
 *
 * @author celeb
 */
public class DummyValidator implements DataValidationInterface {

    @Override
    public boolean validateLine(String line) {
        return true;
    }
    
}