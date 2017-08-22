package bmi;
//Java extension packages
import java.text.*;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class InputHelpers 
{
    public static final int CANCEL_FLAG = -99;
    private static final NumberFormat decimalFormatter = NumberFormat.getNumberInstance();
    private static Scanner input = new Scanner(System.in);

    /******************  Scanner methods ***************************/
    public static int getScannerInput(String dataInput, int minValue,int maxValue) 
    {
        int num = 0;
        boolean valid;
        String prompt;

        prompt = "Enter a " + dataInput + " between " + minValue + " and "
                        + maxValue + ": ";
        do 
        {
            try 
            {
                System.out.print(prompt);
                while (!input.hasNextInt()) {
                        input.next();
                        System.out.print("Invalid number " + prompt);
                }
                num = input.nextInt();
                if (num >= minValue && num <= maxValue) 
                {
                   valid = true;
                } else 
                {
                    valid = false;
                }
            }
            catch (Exception ex) 
            {
                    OutputHelpers.showExceptionDialog("Illegal input " + prompt, "Illegal " + dataInput);
                    valid = false;
            }
        } while (!valid);
        return num;
    }
    public static double getScannerInput(String dataInput, double minValue, double maxValue)
    {
        double num = 0;
        boolean valid;
        String prompt = "Enter a " + dataInput + " between "
                        + decimalFormatter.format(minValue) + " and "
                        + decimalFormatter.format(maxValue) + ": ";
        do 
        {
            try 
            {
                System.out.print(prompt);
                while (!input.hasNextDouble()) {
                        input.nextLine();
                        System.out.print(prompt);
                }
                num = input.nextDouble();
                if (num >= minValue && num <= maxValue) 
                {
                    valid = true;
                } else 
                {
                     valid = false;
                }
            }
            catch (Exception ex) {
                    OutputHelpers.showExceptionDialog("Illegal input " + prompt, "Illegal " + dataInput);
                    valid = false;
            }
        } while (!valid);
        return num;
    }
    public static String getScannerInput(String dataInput)
    {
        String strInput;
        boolean valid;
        String prompt = "\nEnter a " + dataInput + ": ";
        do 
        {
            System.out.print(prompt);
            strInput = input.nextLine();
            if (strInput == null || strInput.trim().length() == 0) 
            {
                valid = false;
            }
            else 
            {
                valid = true;
            }
        } while (!valid);
        return strInput;
    }
    public static void closeScanner() 
    {
        if (input != null) 
        {
            input.close();
        }
    }
}
