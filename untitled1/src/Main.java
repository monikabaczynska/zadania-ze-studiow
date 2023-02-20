import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(isAnagram("Monia","Monai"));
    }


    public static boolean isAnagram(String test, String original) {
        String test1 = test.toLowerCase();
        String original1 = original.toLowerCase();

        System.out.println(test1);
        System.out.println(original1);

        String test2 = test1.replaceAll("\\s+","");
        String original2 = original1.replaceAll("\\s+","");

        System.out.println(test2);
        System.out.println(original2);

        char [] testChars = test2.toCharArray();
        char [] originalChars = original2.toCharArray();

        Arrays.sort(testChars);
        Arrays.sort(originalChars);


        return testChars.equals(originalChars);


    }
}