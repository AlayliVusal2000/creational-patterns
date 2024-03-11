package factory;

public class PhoneFabric {


    public static Phone createPhone(String model, String battery, int weight, int length) {
        Phone phone;
        if (model.equalsIgnoreCase("Samsung")) {
            phone = new Samsung(model, battery, weight, length);
        } else if (model.equalsIgnoreCase("Xiaomi")) {
            phone = new Xiaomi(model, battery, weight, length);
        } else {
            throw new RuntimeException("Correct create phone");
        }
        return phone;

    }
}
