package factory;

public class Samsung implements Phone {

    String model;
    String battery;
    int weight;
    int length;

    public Samsung(String model, String battery, int weight, int length) {
        this.model = model;
        this.battery = battery;
        this.weight = weight;
        this.length = length;
    }

    public String getModel() {
        return model;
    }

    public String getBattery() {
        return battery;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "model='" + model + '\'' +
                ", battery='" + battery + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                '}';
    }
}