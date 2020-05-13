package c02.variables;

public class StringDemo {

    public static void main(String[] args) {

        String s = "This is a DUMMY string    ";

        String trimmedString = s.trim();
        String lowerCaseString = s.toLowerCase();
        String replacedCharsString = s.replace('M', 'P');
        String substring = s.substring(8, 10);

        String prefix = "This is a";
        boolean startsWith = s.startsWith(prefix);
        boolean isEmpty = s.isEmpty();
        boolean containsString = s.contains("DUMMY");

        int exactMatch = s.compareTo("This is a DUMMY string    ");
        int match = s.compareToIgnoreCase("THIS is a dummy string    ");
        int indexOf = s.indexOf("s");
        int length = s.length();

        char firstChar = s.charAt(0);
        char lastChar = s.charAt(length - 1);


        System.out.println("Trimmed string: " + trimmedString + "*");
        System.out.println("Lower case string: " + lowerCaseString);
        System.out.println("Edited string: " + replacedCharsString);
        System.out.println("First two chars: " + substring);

        System.out.println("String starts with " + prefix + ": " + startsWith);
        System.out.println("String is empty: " + isEmpty);
        System.out.println("Contains 'DUMMY' string: " + containsString);

        System.out.println("Compared to identical string: " + exactMatch);
        System.out.println("Compared to different case string: " + match);
        System.out.println("Index of string: " + indexOf);
        System.out.println("Length of string: " + length);

        System.out.println("First char: " + firstChar);
        System.out.println("Last char: " + lastChar);
    }
}
