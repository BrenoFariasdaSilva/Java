public class Characters {
    public static void main (String[] args) {
        char letter = 'a';
        // This won't compile: char letter = "a";
        System.out.println("Result of \"char letter = 'a';\" is: " + letter);

        char value = 66; // Java uses the ASCII tables as well.
        System.out.println("Value of char variable: " + value);

        value = (char) (value + 1);
        System.out.println("Value of \"value = (char) (value + 1);\" is: " + value + "\n");

        String word = "This year is ";
        System.out.println("Result of the previous line: \"String word = \"This year is \";\" is: " + word);
        word = word + 2023;
        System.out.println("The new string will be the concatenation of the previous string with an int: " + word);
    }
}
