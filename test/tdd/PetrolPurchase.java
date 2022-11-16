package tdd;
//3.12 (Class PetrolPurchase) Create a class called PetrolPurchase to represent information
//        about the petrol you purchase. The class should include five pieces of information in the form of
//        instance variables—the station’s location (type String), the type of petrol (type String),
//        the quantity (type int) of the purchase in liters, the price per liter (double), and the percentage discount
//        (double). Your class should have a constructor that initializes the five instance variables. Provide a
//        set and a get method for each instance variable. In addition, provide a method named getPurchase Amount
//        that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
//        minus the discount, then returns the net amount you had to pay as a double value. Write an application
//        class named Petrol that demonstrates the capabilities of class PetrolPurchase.

public class PetrolPurchase {
    private String location;
    private String type;
    private int quantity;
    private double price;
    private  double discount;

    public void setLocation(String ipaja) {
        this.location = ipaja;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        type = "clean";
        return type;
    }

    public int getQuantity() {
        return quantity;

    }

    public void setQuantity(int quantity) {
        this.quantity = 0;
    }


    public void setPrice(double price) {
        this.price = 200;
    }

    public double getPrice() {
        return price;
    }

    public void setDiscount(double discount) {
        this.discount = 0;
    }

    public double getDiscount() {
        if (discount == price/5) {
        }
        return discount;
    }
}
