
package pizza;

import helpers.*;

public class PizzaOrder {
    
    public enum Size {
        Small, Medium, Large
    }
    
    public static final double DEFAULT_SIZE_PRICE = 12.99;
    public static final String DEFAULT_SIZE = "Large";
    public static final double MIN_TOTAL = 0;
    public static final double MAX_TOTAL = 30;
    
    private static final String SMALL= "Small";
    private static final double SMALL_PRICE = 6.99;
    
    private static final String MEDIUM = "Medium";
    private static final double MEDIUM_PRICE = 9.99;
    
    private static final String LARGE = "Large";
    private static final double LARGE_PRICE = 12.99;
        
    private final PizzaItem pizzaSize = new PizzaItem(DEFAULT_SIZE, DEFAULT_SIZE_PRICE);
    private PizzaItem extraCheese = new PizzaItem("Extra Cheese", 1.50);
    private final PizzaItem sausage = new PizzaItem("Sausage", 2.25);
    private final PizzaItem ham = new PizzaItem("Ham", 2.25);
    private final Person customer = new Person();
    
    public void setFirstName(String firstName){
        customer.firstName = firstName;
    }
    public void setLastName(String lastName) {
        customer.lastName = lastName;
    }

    public void setPizzaSize(Size size) {
         switch (size) {
             case Small:
                 setPizzaItem(pizzaSize, SMALL, SMALL_PRICE);
                 break;
             case Medium:
                 setPizzaItem(pizzaSize, MEDIUM, MEDIUM_PRICE);
                 break;
             case Large:
                 setPizzaItem(pizzaSize, LARGE, LARGE_PRICE);
                 break;
             default:
                 setPizzaItem(pizzaSize, LARGE, LARGE_PRICE);
                 break; 
         }
         pizzaSize.setSelected(true);
    }
    private void setPizzaItem(PizzaItem item, String itemType, double price)
    {
        item.setItemType(itemType);
        item.setPrice(price);
    }
    public void setCheese(boolean selected)
    {
        extraCheese.setSelected(selected);
    }
    public void setSausage(boolean selected)
    {
        sausage.setSelected(selected);
    }
    public void setHam(boolean selected)
    {
        ham.setSelected(selected);
    }
    public void clearOrder() {
        setPizzaSize(Size.Large);
        extraCheese.ClearItem();
        sausage.ClearItem();
        ham.ClearItem();
    }

    @Override
    public String toString() {
        double total = 0;
        StringBuilder str = new StringBuilder();
        
        str.append("Pizza order for:\n\t");
        str.append(customer.getFullName());
        str.append("\n\t");
        if (pizzaSize.getSelected()) {
            str.append(pizzaSize.toString());
            str.append("\n\t");
            total += pizzaSize.getPrice();
        }
        if (extraCheese.getSelected()) {
            str.append(extraCheese.toString());
            str.append("\n\t");
            total += extraCheese.getPrice();
        }
        if (sausage.getSelected()) {
            str.append(sausage.toString());
            str.append("\n\t");
            total += sausage.getPrice();
        }
        if (ham.getSelected()) {
            str.append(ham.toString());
            str.append("\n\t");
            total += ham.getPrice();
        }
        str.append("\n\t\tTotal: ");
        str.append(OutputHelpers.formattedCurrency(total));
        return str.toString();
    }
    
}
