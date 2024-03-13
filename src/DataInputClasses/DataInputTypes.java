/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataInputClasses;

import Interfaces.DataInputInterface;

/**
 *
 * @author celeb
 */
public enum DataInputTypes {
    FILE(new FileInput(), 7),
    CONSOLE(new ConsoleInput(), 9),
    DATABASE(new DatabaseInput(), 42);
    
    // Fields of the constants
    public DataInputInterface input;
    public int coolNum;
    
    DataInputTypes(DataInputInterface input, int coolNum) {
        this.input = input;
        this.coolNum = coolNum;
    }

    public DataInputInterface getInput() {
        return input;
    }
    
}
