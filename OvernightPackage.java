package packagedeliverysystem;

public class OvernightPackage extends Package {
    private double additionalFeePerOunce;

    public OvernightPackage(String senderName, String senderAddress, String senderCity, String senderState, int senderZip,
                            String recipientName, String recipientAddress, String recipientCity, String recipientState, int recipientZip,
                            double weight, double costPerOunce, double additionalFeePerOunce) {
        
        super(senderName, senderAddress, senderCity, senderState, senderZip, recipientName, recipientAddress, recipientCity, recipientState, recipientZip, weight, costPerOunce);
        this.additionalFeePerOunce = additionalFeePerOunce;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + (getWeight() * additionalFeePerOunce);
    }

    @Override
    public void display() {
        System.out.println("=== OVERNIGHT PACKAGE ===");
        super.display();
    }
}