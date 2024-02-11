import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str1 = "antonyandcleopatra";
        String str2 = "antaniandcleopadra";
        compareStrings(str1, str2);
    }

    private static void compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Output");
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                System.out.println(str1.charAt(i) + "," + str2.charAt(i));
            }
        }
    }
}
