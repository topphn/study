package education;

import java.security.MessageDigest;

public class Lesson1 {
    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.println(b);
        }
    }
}
