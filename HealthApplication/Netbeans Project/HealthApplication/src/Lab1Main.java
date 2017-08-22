
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**************************************************** 
Program Name: HealthProfile.java 
Programmer's Name: Kevin Nguyen 
Program Description: GymsRUs has a need to provide fitness/health information to their clients, including BMI and maximum heart rate.
***********************************************************/


public class Lab1Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        DecimalFormat oneDigit = new DecimalFormat("#,##0.0");//format to 1 decimal place
        boolean stop = false;
        int count = 0;
        while (!stop) {
            System.out.print("Enter name or X to quit: ");            
            if (count > 0) {
                input.nextLine();
            }
            count++;
            String name = input.nextLine(); // read name
            if (name.trim().toUpperCase().equals("X")) {
                stop = true;
                break;
            }
            System.out.print("Your age: ");
            int age = input.nextInt();
            System.out.print("Your weight: ");
            double weight = input.nextDouble(); // read weight
            System.out.print("Your height - feet: "); 
            double feetHeight = input.nextDouble();
            System.out.print("Your height - inches: ");
            double inchesHeight = input.nextDouble();
            HealthProfile profile = new HealthProfile(name, age, feetHeight, inchesHeight, weight); // create HealthProfile object
            System.out.println("Health Profile for " + name);
            System.out.println("BMI: " + oneDigit.format(profile.getBMI())); // calculate bmi
            System.out.println("BMI Category: " + profile.getCategory()); // get category
            System.out.println("Max heart rate: " + profile.getMaxHR()); // get max heart rate
            System.out.println();
        }
        
    }
}
