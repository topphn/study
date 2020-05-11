package education;

import education.lesson7and8.*;

public abstract class LastTaskSpace implements InterfaceSpace {
    private ImmVehicle vehicle;
    private ImmPerson person;

    protected LastTaskSpace() {
        this.person = new ImmPerson();
        this.vehicle = new ImmVehicle();
    }

    protected LastTaskSpace(ImmPerson person, ImmVehicle vehicle) {
        this.person = person;
        this.vehicle = vehicle;
    }

    protected LastTaskSpace(ImmPerson person) {
        this.person = person;
        this.vehicle = ImmVehicle.DEFAULT_VEHICLE;
    }

    public ImmVehicle getVehicle() {
        return vehicle;
    }

    public ImmPerson getPerson() {
        return person;
    }

    @Override
    public boolean isSpaceFree() {
        return this.getVehicle().getType().equals(VehicleTypes.NONE) || this.vehicle == ImmVehicle.DEFAULT_VEHICLE;
    }
}
