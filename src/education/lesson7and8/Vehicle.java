package education.lesson7and8;

public class Vehicle {
    public static final String DEFAULT_VALUE = "";
    private String number;
    private String model;
    private String manufacturer;

    public Vehicle() {
        this.number = DEFAULT_VALUE;
        this.model = DEFAULT_VALUE;
        this.manufacturer = DEFAULT_VALUE;
    }

    public Vehicle(String number, String model, String manufacturer) {
        this.number = number;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}