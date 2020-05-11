package education;

import education.lesson7and8.Person;
import education.lesson7and8.Space;
import education.lesson7and8.Vehicle;

public class Lesson7 {
    public static void main(String[] args) throws Exception {
        t1();
        t2();
        t3();
    }

    static void t1() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Task 1");
        Person p1 = new Person("Name1", "Surname1");
        Person p2 = new Person();
        System.out.println("Name p1 - " + p1.getName());
        System.out.println("Name p2 - " + p2.getName());
        p2.setName("NAME@");
        System.out.println("NEW name p2 - " + p2.getName());
    }

    static void t2() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Task 2");
        Vehicle v1 = new Vehicle("X123XX123", "SHAXA", "AUTOVAS");
    }

    static void t3() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Task 3");
        Vehicle v1 = new Vehicle("X123XX123", "SHAXA", "AUTOVAS");
        Person p1 = new Person("Name1", "Surname1");
        Space space1 = new Space(p1, v1);
        System.out.println("Space is free - " + space1.isSpaceFree());
        Vehicle v2 = new Vehicle();
        Space space2 = new Space(p1, v2);
        System.out.println("Space is free - " + space2.isSpaceFree());

    }
}