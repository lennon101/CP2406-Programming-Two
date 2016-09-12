// Creates and displays an array of boats -
// some are rowboats; some are ocean liners

import javax.swing.*;
public class DebugEleven4 {
    static DebugBoat[] boatArray = new DebugBoat[5];

    public static void main(String[] args) {
        buildArray();
        displayArray();
    }

    public static void buildArray() {
        //declare x as int in for loop
        char boatTypeString;
        for(int i = 0; i < boatArray.length; ++i) {
            boatTypeString = getBoat();
            if(boatTypeString =='r')
                boatArray[i] = new DebugRowboat();
            else
                boatArray[i] = new DebugOceanLiner();
        }
    }

    public static char getBoat() {
        String boatType;
        boatType = JOptionPane.showInputDialog(null,
                "Enter r for rowboat; o for ocean liner ");
        return boatType.charAt(0);
    }

    public static void displayArray() {
        for(int i = 0; i < boatArray.length; ++i)
            JOptionPane.showMessageDialog(null, "Boat # " + (i  + 1) + ": " +
                    boatArray[i]);
    }

}
