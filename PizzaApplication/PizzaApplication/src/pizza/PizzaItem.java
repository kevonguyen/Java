
package pizza;

import helpers.*;

public class PizzaItem {
    
    public static final double DEFAULT_PRICE = 12.99;
    public static final double MIN_PRICE = 0;
    public static final double MAX_PRICE = 12.99;
    public static final String DEFAULT_TYPE = "Item";
    
    private String itemType;
    private double price;
    private boolean isSelected = false;
    
    public PizzaItem(){
        this.itemType = DEFAULT_TYPE;
        this.price = MIN_PRICE;
    }
    public PizzaItem(String itemType, double price) {
        setItemType(itemType);
        setPrice(price);
    } 
    public String getItemType() {
        return itemType;
    }
    public final void setItemType(String itemType) {
        if (!StringHelpers.IsNullOrEmpty(itemType)) {
             this.itemType = itemType;
        }
        else {
            this.itemType = DEFAULT_TYPE;
        }
    }
    public double getPrice() {
        return price;
    }
    public final void setPrice(double price) {
        if (price >= MIN_PRICE && price <= MAX_PRICE) {
            this.price = price;
        }
        else if (price <MIN_PRICE ) {
            this.price = MIN_PRICE;
        }
        else {
            this.price = MAX_PRICE;
        }
    }
    public Boolean getSelected() {
        return isSelected;
    }
    public void setSelected(boolean selected) {
        this.isSelected = selected;
    }
    @Override
    public String toString() {
        return itemType + ",  price: " + OutputHelpers.formattedCurrency(price);
    }
    public void ClearItem() {
        this.itemType = DEFAULT_TYPE;
        this.price = MIN_PRICE;
        isSelected = false;
    }
    
}
