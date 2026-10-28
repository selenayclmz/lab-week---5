package packagedeliverysystem;

public class TwoDayPackage extends Package {
    private double flatFee;

    public TwoDayPackage(String senderName, String senderAddress, String senderCity, String senderState, int senderZip,
                         String recipientName, String recipientAddress, String recipientCity, String recipientState, int recipientZip,
                         double weight, double costPerOunce, double flatFee) {
        
        super(senderName, senderAddress, senderCity, senderState, senderZip, recipientName, recipientAddress, recipientCity, recipientState, recipientZip, weight, costPerOunce);
        this.flatFee = flatFee;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + flatFee;
    }

    @Override
    public void display() {
        System.out.println("=== TWO DAY PACKAGE ===");
        super.display();
    }
}