package packagedeliverysystem;

public class Package {
    private String senderName;
    private String senderAddress;
    private String senderCity;
    private String senderState;
    private int senderZip;
    private String recipientName;
    private String recipientAddress;
    private String recipientCity;
    private String recipientState;
    private int recipientZip;
    private double weight;
    private double costPerOunce;

    public Package(String senderName, String senderAddress, String senderCity, String senderState, int senderZip,
                   String recipientName, String recipientAddress, String recipientCity, String recipientState, int recipientZip,
                   double weight, double costPerOunce) {
        
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZip = senderZip;
        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.recipientCity = recipientCity;
        this.recipientState = recipientState;
        this.recipientZip = recipientZip;

        if (weight > 0.0) {
            this.weight = weight;
        } else {
            this.weight = 1.0;
        }

        if (costPerOunce > 0.0) {
            this.costPerOunce = costPerOunce;
        } else {
            this.costPerOunce = 1.0;
        }
    }

    public double getWeight() {
        return weight;
    }

    public double calculateCost() {
        return weight * costPerOunce;
    }

    public void display() {
        System.out.println("Sender: " + senderName + ", " + senderAddress + ", " + senderCity + ", " + senderState + ", " + senderZip);
        System.out.println("Receiver: " + recipientName + ", " + recipientAddress + ", " + recipientCity + ", " + recipientState + ", " + recipientZip);
        System.out.println("Weight: " + weight + " oz | Cost Per Ounce: $" + costPerOunce);
        System.out.println("Total Cost: $" + calculateCost());
        System.out.println("--------------------------------------------------");
    }
}