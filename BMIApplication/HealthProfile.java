package bmi;
public class HealthProfile 
{
    public static final int MIN_AGE = 1;
    public static final int MAX_AGE = 120;
    public static double MIN_WEIGHT = 20;
    public static double MAX_WEIGHT = 600;
    public static int MIN_FEET = 0;
    public static int MAX_FEET = 8;
    public static int MIN_INCH = 0;
    public static int MAX_INCH = 12;
   
    private String name;
    private int age;
    private double weight;
    private double height;
    
    public HealthProfile() 
    {
        setName("Not Given");
        setAge(30);
        setWeight(175);
        setHeight(5, 10);
    }
    public void setName(String name)
    {
       
    }
    public String getName()
    {
        return null;
    }
    public void setAge(int age)
    {
  
    }
    public int getAge()
    {
        return age;
    }
    public void setWeight(double weight) 
    {
    }
    public double getWeight()
    {
        return 0;
    }
    public void setHeight(int feet, int inches)
    {
      
    }
    public double getBMI()
    {
        double bmi = 0;
       
        return bmi;
    }
    public String getCategory()
    {
        String category = "";
        double bmi = getBMI();
        
        return category;
    }
    public int getMaxHR()
    {
        return 0;
    }
}
