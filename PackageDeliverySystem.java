package packagedeliverysystem;

public class PackageDeliverySystem {
    public static void main(String[] args) {
        System.out.println("=== STANDARD PACKAGE ===");
        Package obj1 = new Package("Selenay", "Kocasinan", "Kayseri", "İç Anadolu", 38500, "Zehra", "Yahyalı", "Kayseri", "İç Anadolu", 38000, 10.0, 2.5);
        obj1.display();

        TwoDayPackage obj2 = new TwoDayPackage("Güven", "Beyoğlu", "İstanbul", "Turkey", 34000, "Furkan", "Bahçelievler", "İstanbul", "Turkey", 34000, 15.0, 2.0, 5.0);
        obj2.display();

        OvernightPackage obj3 = new OvernightPackage("Yeter", "İldem", "Kayseri", "Turkey", 38200, "Esra", "Cumhuriyet", "Kayseri", "Turkey", 38000, 12.0, 3.0, 1.5);
        obj3.display();
    }
}