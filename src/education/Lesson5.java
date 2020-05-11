package education;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson5 {
    private static final Pattern patternSnils = Pattern.compile("^(\\d)(\\d)(\\d)-(\\d)(\\d)(\\d)-(\\d)(\\d)(\\d) (\\d\\d)$");
    private static final Pattern patternChat = Pattern.compile("^(.*): (.*)$");

    public static void main(String[] args) throws Exception {
        t1();
        t2();
        t3();
    }

    private static String printNickChatting(String[] nickNames, String[] textLines) {
        Map<String, String> map = new HashMap<>();
        for (String str : nickNames) map.put(str, "");
        Matcher matcher;
        for (int i = 0; i < textLines.length; i++) {
            matcher = patternChat.matcher(textLines[i]);
            if (matcher.find()) {
                String s = matcher.group(1);
                String s1 = matcher.group(2);
                map.put(s, map.get(s) + (i + 1) + ") " + s1 + "\n");
            }
        }
        StringBuilder result = new StringBuilder();
        for (String str : nickNames) {
            result.append(str).append(": \n").append(map.get(str));
        }

        return result.toString();
    }

    static void t3() {
        System.out.println("Parsing of chat");
        System.out.println("----------------------------------------------------------------------");
        String[] nickNames = {
                "xxx", "yyy", "СССР", "шпак", "Людмила"};
        String[] textLines = {
                "xxx: ну как там твой интровертный карантинный рай?)   ",
                "yyy: ну вот представь ",
                "yyy: все экстраверты сидят по домам   ",
                "yyy: и ещё и работу у большинства отменили    ",
                "yyy: так что теперь им не хватает общения и все они ежедневно пишут всем своим контактам( ",
                "yyy: серьёзно, я никогда так часто не переписывалась с большинством своих коллег, родственников и друзей  ",
                "yyy: как вторая работа, блин( ",
                "шпак: Как то забавно получилось? Вирус привезли богатые на самолётах, а расплачиваться как всегда бедным? ",
                "Людмила: Юристы есть в чате? Очень нужен совет..  ",
                "СССР: Тут только вирусологи. Ты пиши вопрос сразу. Вдруг был случай, разберём ",
                "xxx: кажется я постарел ) ",
                "xxx: не могу найти выход из стартовой локации в игре )    ",
                "yyy: Ахахахаха    ",
                "xxx: я даже кнопку выход там не нашел, как старпер вышел по Alt+F4    "};
        System.out.print(printNickChatting(nickNames, textLines));

    }

    static void t1() {
        System.out.println("Validation of polindroms");
        isPalindrome("1  1011");
        isPalindrome("1011");
        isPalindrome("110_11");
        isPalindrome("aA1aa");
        isPalindrome("");
        System.out.println("----------------------------------------------------------------------");
    }

    static void t2() {
        System.out.println("Validation of SNILS");
        validateSnils("111-111-111 1");
        validateSnils("160-722-773 54");
        validateSnils("111-111-111 11");
        validateSnils(" 111-111-111 11");
        System.out.println("----------------------------------------------------------------------");
    }

    private static void isPalindrome(String string) {
        String s = string.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println("Is " + string + " a polindrom: "
                + s.equals((new StringBuilder(s)).reverse().toString()));
    }

    private static int calcControlSum(int sum) {
        if (sum < 100) {
            return sum;
        } else if (sum == 100 || sum == 101) {
            return 0;
        } else {
            return sum % 101;
        }
    }

    private static void checkSum(Matcher snils) {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += Integer.parseInt(snils.group(i)) * (10 - i);
        }
        if (Integer.parseInt(snils.group(10)) == calcControlSum(sum)) {
            System.out.println("Is valid SNILS");
        } else {
            System.out.println("Snils has wrong control sum");
        }
    }

    private static void validateSnils(String string) {
        System.out.println(string);
        Matcher matcher = patternSnils.matcher(string);
        if (matcher.find()) {
            checkSum(matcher);
        } else {
            System.out.println("False...");
        }
    }
}