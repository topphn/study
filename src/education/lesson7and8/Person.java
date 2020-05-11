package education.lesson7and8;

public class Person {
    private String name;
    private String surname;
    public static final String DEFAULT = "";

    public Person() {
        this.name = DEFAULT;
        this.surname = DEFAULT;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }
}
