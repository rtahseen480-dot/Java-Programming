

import java.util.*;

public class string{

    public static void main(String[] args) {

        String str = "Java Programming Is Very Interesting";
        String str2 = "java programming is very interesting";

        System.out.println("Original String: " + str);

        // 1. String Length
        System.out.println("Length: " + str.length());

        // 2. Uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 3. Lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 4. Reverse String
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse: " + reverse);

        // 5. Compare Strings
        System.out.println("Equals: " + str.equals(str2));
        System.out.println("Ignore Case: " + str.equalsIgnoreCase(str2));

        // 6. Character at Index
        System.out.println("Character at index 2: " + str.charAt(2));

        // 7. Find Substring
        System.out.println("Substring: " + str.substring(5, 16));

        // 8. Replace Character
        System.out.println("Replace: " + str.replace('a', '@'));

        // 9. Contains
        System.out.println("Contains Java: " + str.contains("Java"));

        // 10. Starts With
        System.out.println("Starts with Java: " + str.startsWith("Java"));

        // 11. Ends With
        System.out.println("Ends with Interesting: " +
                str.endsWith("Interesting"));

        // 12. Count Vowels
        int vowels = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                vowels++;
            }
        }

        System.out.println("Vowels: " + vowels);

        // 13. Count Consonants
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch >= 'a' && ch <= 'z' &&
                "aeiou".indexOf(ch) == -1) {
                consonants++;
            }
        }

        System.out.println("Consonants: " + consonants);

        // 14. Count Words
        String[] words = str.trim().split("\\s+");
        System.out.println("Word Count: " + words.length);

        // 15. Print Each Word
        System.out.println("Individual Words:");

        for (String word : words) {
            System.out.println(word);
        }

        // 16. Palindrome Check
        String palindrome = "madam";

        String rev = new StringBuilder(palindrome)
                .reverse().toString();

        if (palindrome.equals(rev)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

        // 17. Character Frequency
        Map<Character, Integer> frequency = new LinkedHashMap<>();

        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch != ' ') {
                frequency.put(ch,
                        frequency.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Character Frequency:");

        for (Map.Entry<Character, Integer> entry :
                frequency.entrySet()) {
            System.out.println(
                    entry.getKey() + " = " + entry.getValue());
        }

        // 18. Remove Spaces
        System.out.println("Without Spaces: " +
                str.replace(" ", ""));

        // 19. Remove Duplicate Characters
        StringBuilder unique = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (unique.indexOf(String.valueOf(ch)) == -1) {
                unique.append(ch);
            }
        }

        System.out.println("Unique Characters: " + unique);

        // 20. Convert String to Character Array
        char[] arr = str.toCharArray();

        System.out.println("Character Array:");

        for (char ch : arr) {
            System.out.print(ch + " ");
        }

        System.out.println("\nString Program Completed!");
    }
}

    

