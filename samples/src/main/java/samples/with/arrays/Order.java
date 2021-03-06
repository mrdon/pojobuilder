package samples.with.arrays;


import net.karneim.pojobuilder.GeneratePojoBuilder;
import samples.with.builderbaseclass.BaseBuilder;

@GeneratePojoBuilder
public class Order {
    private String customer;
    private Item[] items;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
    
    
}
