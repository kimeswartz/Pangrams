public class PangramChecker {

    public static boolean checkAllLetters(String userInputString) {

        userInputString = userInputString.toLowerCase();

        // Assume all letters in userInput are present initially
        boolean allLettersPresent = true;

        // Loop through each letter in the (English) alphabet (a-z)
        for (char alphabetChars = 'a'; alphabetChars <= 'z'; alphabetChars++) {

            // Check if the current letter (alphabetChars ) is not in the input string
            if (!userInputString.contains(String.valueOf(alphabetChars))) {
                allLettersPresent = false;
                break;
            }
        }

        // Return true if all letters are present, otherwise return false
        return allLettersPresent;
    }
}