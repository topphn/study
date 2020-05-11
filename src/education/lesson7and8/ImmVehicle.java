package education.lesson7and8;

public final class ImmVehicle extends Vehicle {
    public static final ImmVehicle DEFAULT_VEHICLE = new ImmVehicle();
    private VehicleTypes type;

    public ImmVehicle() {
        super();
        this.type = VehicleTypes.NONE;
    }

    public ImmVehicle(String number, String model, String manufacturer, VehicleTypes vehicleTypes) {
        super(number, model, manufacturer);
        this.type = vehicleTypes;
    }

    public VehicleTypes getType() {
        return type;
    }

    @Override
    public void setNumber(String number) {
    }

    @Override
    public void setModel(String model) {
    }

    @Override
    public void setManufacturer(String manufacturer) {
    }
}