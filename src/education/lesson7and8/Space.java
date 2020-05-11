package education.lesson7and8;

public class Space implements InterfaceSpace{
    private Person person;
    private Vehicle vehicle;

    public Space() {
        this.person = new Person();
        this.vehicle = new Vehicle();
    }

    public Space(Person person, Vehicle vehicle) {
        this.person = person;
        this.vehicle = vehicle;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public boolean isSpaceFree() {
        return vehicle.getNumber().equals(Vehicle.DEFAULT_VALUE) || vehicle.getClass() == null;
    }
}
