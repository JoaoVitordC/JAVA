package entities;

public class Products {

    public String name;
    public double price;
    public int quantity;

    public double totaleValueInStock(){
        return price * quantity;
    }

    public void  AddProducts(int quantity){
         this.quantity += quantity;
    }
    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                +", "
                +quantity
                + "units Total: $"
                +String.format("%.2f",totaleValueInStock());
    }
}
