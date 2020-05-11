package education;

import education.lesson7and8.*;

public class Lesson8 {
    public static void main(String[] args) throws Exception {
        t1_2();
        t3();
    }

    static void t1_2() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Task 1 and 2");
        ImmPerson p1 = new ImmPerson("Name1", "Surname1");
        ImmPerson p2 = new ImmPerson();
        System.out.println("Name p1 - " + p1.getName());
        System.out.println("Name p2 - " + p2.getName());
        String s = p2.getName();
        s = "asdadsadasd";
        p2.setName("NAME AFTER TRYING TO CHANGE");
        System.out.println("Result name p2 - " + p2.getName());
        ImmVehicle v1 = new ImmVehicle("X123XX123", "SHAXA", "AUTOVAS", VehicleTypes.MOTOR_BIKE);
        System.out.println("Number - " + v1.getNumber() + "; Mode - " + v1.getModel() + "; Manufacturer - "
                + v1.getManufacturer() + "; Type - " + v1.getType());
        VehicleTypes vehicleTypes = VehicleTypes.CAR;
        v1.setManufacturer("2112412412");
        v1.setModel("asdasdadad");
        System.out.println("Number - " + v1.getNumber() + "; Mode - " + v1.getModel() + "; Manufacturer - "
                + v1.getManufacturer() + "; Type - " + v1.getType());
        ImmVehicle vDefault = ImmVehicle.DEFAULT_VEHICLE;
        System.out.println("Type of vehicle - " + vDefault.getType());

    }

    static void t3() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Task 3");
        ImmVehicle v1 = new ImmVehicle("X123XX123", "SHAXA", "AUTOVAS",VehicleTypes.SUV);
        ImmPerson p1 = new ImmPerson("Name1", "Surname1");
        spaceFromAbstract space1 = new spaceFromAbstract(p1,v1);
        System.out.println("Space is free - " + space1.isSpaceFree());
        LastTaskSpace space2 = new spaceFromAbstract(p1);
        System.out.println("Space is free - " + space2.isSpaceFree());
        LastTaskSpace space3 = new spaceFromAbstract();
        System.out.println("Space is free - " + space2.isSpaceFree());

    }
    static class spaceFromAbstract extends LastTaskSpace {
        public spaceFromAbstract() {
            super();
        }

        public spaceFromAbstract(ImmPerson person, ImmVehicle vehicle) {
            super(person, vehicle);
        }

        public spaceFromAbstract(ImmPerson person) {
            super(person);
        }
    }
}
