/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;
import java.text.NumberFormat;

public class Lab1_Main_shell {
    
    public static void main(String[] args) {
        
        ApplicationHelpers.displayApplicationInformation("Health Profile Program",
                                                        "1", 
                                                        "Calculates BMI from age, weight, and hieght");
        
        do 
        {
           processHealthProfile();
            
        } while (ApplicationHelpers.continueProcessing("BMI Profile"));
        ApplicationHelpers.terminateApplication("Health Profile");
    }
    private static void processHealthProfile()
    {
        String name;
        int age;
        double weight;
        int feet = 0;
        int inches = 0;
        
        HealthProfile profile = new HealthProfile();
        
        name = InputHelpers.getScannerInput("Name");
        profile.setName(name);
        
        age = InputHelpers.getScannerInput("Age", HealthProfile.MIN_AGE, HealthProfile.MAX_AGE);
        //set the age
        
        weight = InputHelpers.getScannerInput("Weight", HealthProfile.MIN_WEIGHT, HealthProfile.MAX_WEIGHT);
        //set the weigth
        feet = InputHelpers.getScannerInput("Height in feet", HealthProfile.MIN_FEET, HealthProfile.MAX_FEET);
        inches = InputHelpers.getScannerInput("Height in inches", HealthProfile.MIN_INCH, HealthProfile.MAX_INCH);
        //set the height
        
        displayProfile(profile);
    }
    private static void displayProfile(HealthProfile profile)
    {
       StringBuilder str = new StringBuilder();
       
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        
        OutputHelpers.showOutputSeparator();
        
        str.append("Health Profile for " + profile.getName() + "\n");
        str.append("BMI: " + nf.format(profile.getBMI()) + "\n");
        str.append("BMI Category: " + profile.getCategory() + "\n");
        str.append("Max heart rate: " + profile.getMaxHR() + "\n");
        str.append("\n");
        
        System.out.print(str.toString());
    }
    
    
    
}
