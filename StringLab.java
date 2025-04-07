public class StringLab {
    public static void main(String[] args) {
        String str = " Welcome to the Java String Lab! ";

        System.out.println("Length: " + str.length());
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Extracted substring 'Java': " + str.substring(15, 19));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
        System.out.println("Contains 'Lab': " + str.contains("Lab"));
        System.out.println("Replaced 'Java' with 'Java Programming': " + str.replace("Java", "Java Programming"));

        System.out.println("Words in the string:");
        for (String word : str.split(" ")) {
            System.out.println(word);
        }

        System.out.println("Trimmed string: '" + str.trim() + "'");
        System.out.println("Equals: " + str.equals("java string lab
        import java.util.Scanner;

public class StringChallenges {
    public static void main(String[] args) {
        String original = " Welcome to the Java String Lab! ";
        int vowelCount = 0;
        for (int i = 0; i < original.length(); i++) {
            char ch = Character.toLowerCase(original.charAt(i));
            if ("aeiou".indexOf(ch) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);

        String word = "racecar";
        int start = 0, end = word.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (word.charAt(start++) != word.charAt(end--)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is '" + word + "' a palindrome? " + isPalindrome);

        Scanner scanner = new Scanner(System.in);
        String sentence;
        do {
            System.out.print("Enter a sentence containing the word 'Java': ");
            sentence = scanner.nextLine();
        } while (!sentence.contains("Java"));
        System.out.println("Thank you!");
        scanner.close();
    }
}
public class StringBuilderLab {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        sb.append(" - Learning Java");
        sb.insert(sb.indexOf("Lab") + 3, " is fun");
        sb.delete(sb.indexOf("Learning"), sb.indexOf("Learning") + "Learning".length());
        sb.reverse();
        System.out.println("Final result: " + sb);
    }
}
public class StringBufferLab {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Multithreading Lab");
        sb.append(" - Learning Java");
        sb.insert(sb.indexOf("Lab") + 3, " is fun");
        sb.delete(sb.indexOf("Learning"), sb.indexOf("Learning") + "Learning".length());
        sb.reverse();
        System.out.println("Final result: " + sb);
    }
}
