import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringDemo {

    public static void main(String[] args) {

        String s = "This is a DUMMY string    ";

        String trimmedString  = s.trim();
        String lowerCaseString = s.toLowerCase();
        String replacedCharsString = s.replace('M', 'P');
        String substring = s.substring(0, 2);

        boolean startsWith = s.startsWith("T");
        boolean isEmpty = s.isEmpty();
        boolean containsString = s.contains("DUMMY");

        int indexOf = s.indexOf("DUMMY");
        int match = s.compareToIgnoreCase("THIS is a dummy string    ");
        int length = s.length();

        char firstChar = s.charAt(0);
        char lastChar = s.charAt(length - 1);


        System.out.println("Trimmed string: " + trimmedString);
        System.out.println("Lower case string: " + lowerCaseString);
        System.out.println("Edited string: " + replacedCharsString);
        System.out.println("First two chars: " + substring);

        System.out.println("String starts with T: " + startsWith);
        System.out.println("String is empty: " + isEmpty);
        System.out.println("Contains 'DUMMY' string: " + containsString);

        System.out.println("Index of 'DUMMY' string: " + indexOf);
        System.out.println("Compared to different case string: " + match);
        System.out.println("Length of string: " + length);

        System.out.println("First char: " + firstChar);
        System.out.println("Last char: " + lastChar);


        int amount = 10;
        double price;
        double total;

        price = 20.0;
        total = amount * price;

        List<String> names = Arrays.asList("Luke", "Leya", "Chewy");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        for (String name : names) {
            System.out.println(name);
        }

        List<String> emptyList = new ArrayList<String>();
        emptyList.add("Item one");

    }
}