package education;

import java.time.LocalDate;

public class Lesson3 {

    public static void main(String[] args) throws Exception {
        t1();
        t2();
        t3();
        t4();
        t5();
        t6();
    }

    static void t1() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Task 1");
        byteImage((byte) 12);
        byteImage((byte) -128);
    }

    static void byteImage(byte input) {
        System.out.println(Integer.toBinaryString(input & 0xFF));
    }

    static void t2() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Task 2");
        int a = 46362;
        int b = 1074717522;
        float c = b / ((float) a * a);
        double d = 5e-3 + 5e-2 + c;
        System.out.println(d);
    }

    static void t3() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Task 3");
        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a * b);
        double f = (char) 1234.15;
        long d = (long) (a + f / c + b);
        System.out.println(d);
    }

    static void t4() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Task 4");
        int a = (byte) 44;
        int b = 300;
        short c = (short) (b - a);
        System.out.println(c);
    }

    static void t5() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Task 5");
        powerOfTwo(64);
        powerOfTwo(63);
    }

    static void powerOfTwo(int num) {
        System.out.println("Incoming number " + num);
        while ((num & 1) == 0) {
            num >>= 1;
        }
        if (num == 1) {
            System.out.println("That is right");
        } else {
            System.out.println("That is not right...");
        }

    }

    static void t6() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Task 6");
         System.out.println(LocalDate.now().plusYears(1).getDayOfWeek());
    }
}
