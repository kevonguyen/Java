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

public class HealthProfile {

    private String name;
    private int age;
    private double height;
    private double weight;
    
    //default construct
    public HealthProfile() {
        
    }
    
    /**
     * Construct with parameters
     * @param _name
     * @param _age
     * @param _height
     * @param _weight 
     */
    public HealthProfile(String _name, int _age, double f_height, double i_height,double _weight) {
        setName(_name);
        setAge(_age);
        setWeight(_weight);
        setHeight(f_height, i_height);
    }
    
    /**
     * Set name
     * @param _name 
     */
    public void setName(String _name) {
        this.name = _name;
    }
    
    /**
     * 
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     * set age
     * @param _age 
     */
    public void setAge(int _age) {
        this.age = _age;
    }
    
    /**
     * 
     * @return age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Set height with two parameters height feet, height inches
     * @param feetHeight
     * @param inchesHeight 
     */
    public void setHeight(double feetHeight, double inchesHeight) {
        this.height = feetHeight * 12 + inchesHeight;
    }
    
    /**
     * 
     * @return height in inches
     */
    public double getHeight() {
        return height;
    }
    
    /**
     * set weight
     * @param _weight 
     */
    public void setWeight(double _weight) {
        this.weight = _weight;
    }
    
    /**
     * 
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * 
     * @return  bmi value
     */
    public double getBMI() {
        return 703 * weight / height / height;
    }
    
    /**
     * 
     * @return category
     */
    public String getCategory() {
        double bmi = getBMI();
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 24.9)
            return "Normal";
        else if (bmi < 29.9)
            return "Overweight";
        else
            return "Obese";
    }
    
    /**
     * 
     * @return  max heart rate
     */
    public int getMaxHR() {
        return 220 - age;
    }
}
