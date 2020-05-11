package education.lesson7and8;

public final class ImmPerson extends Person {
    public ImmPerson() {
        super();
    }

    public ImmPerson(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
