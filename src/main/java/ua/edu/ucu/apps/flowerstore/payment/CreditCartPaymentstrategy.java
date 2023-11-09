package ua.edu.ucu.apps.flowerstore.payment;

public class CreditCartPaymentstrategy extends Payment {

    @Override
    public String pay(double price) {
        return "To pay: " + price;
    }
}
