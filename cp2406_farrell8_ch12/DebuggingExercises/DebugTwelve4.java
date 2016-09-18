// An employee ID can't be more than 999
// Keep executing until user enters four valid employee IDs
// This program throws a FixDebugEmployeeIDException

import javax.swing.*;

public class DebugTwelve4 {
    public static void main(String[] args) {
        String inStr, outString = "";
        final int MAX = 999;
        int[] emp = new int[4];
        for (int i = 0; i < emp.length; ++i) {
            inStr = JOptionPane.showInputDialog(null, "Enter employee ID number");
            try {
                emp[i] = Integer.parseInt(inStr);
                if (emp[i] > MAX) {
                    throw (new DebugEmployeeIDException("Number too high " + emp[i]));
                }
            }
            catch(NumberFormatException error){
                    --i;
                    JOptionPane.showMessageDialog(null, inStr + "\nNonnumeric ID");
                }
            catch(DebugEmployeeIDException error) {
                --i;
                JOptionPane.showMessageDialog(null,"");
            }

         }

        for (int x = 0; x < emp.length; ++x) {
            outString = outString + emp[x] + " ";
        }
        JOptionPane.showMessageDialog(null, "Four valid IDS are: " + outString);
    }
}