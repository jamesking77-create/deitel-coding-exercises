package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Petrol {
    @Test

    public void petrolTest(){
        PetrolPurchase petrol = new PetrolPurchase();
        petrol.setLocation("ipaja");
        String location = petrol.getLocation();
        assertEquals( "ipaja", location);
    }
    @Test
    public void petrolType(){
        PetrolPurchase petrol = new PetrolPurchase();
        String type = petrol.getType();
        assertEquals("clean", type);

    }
    @Test
    public void petrolQuantity(){
        PetrolPurchase petrol = new PetrolPurchase();
        petrol.setQuantity(0);
        int quantity = petrol.getQuantity();
        assertEquals(0, quantity);
    }
    @Test
    public void petrolPrice(){
        PetrolPurchase petrol = new PetrolPurchase();
        petrol.setPrice(200);
        double quantity = petrol.getPrice();
        assertEquals(200, quantity);

}
    @Test
    public void petrolDiscount(){
        PetrolPurchase petrol = new PetrolPurchase();
        petrol.setDiscount(200);
        double quantity = petrol.getDiscount();
        assertEquals(0, quantity);
}}

