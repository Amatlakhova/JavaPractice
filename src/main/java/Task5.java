public class Task5
{
    public static void main(String[] args)
    {
        String encoded = encode("Zebra");
        System.out.println(encoded);

        String decoded = decode(encoded);
        System.out.println(decoded);

    }

    public static String encode(String text)
    {
        StringBuilder encoded = new StringBuilder();
        char[] letters = text.toCharArray();

        for (char letter : letters) {
            String encodedLetter;
            if (letter == 'Z' || letter == 'z') {
                encodedLetter = handleExceptionLetter(letter);
            } else {
                encodedLetter = String.valueOf((char)((int) letter + 1));
            }
            encodedLetter = changeCase(encodedLetter);
            encoded.append(encodedLetter);
        }

        return encoded.toString();
    }

    public static String decode(String text)
    {
        StringBuilder decoded = new StringBuilder();
        char[] letters = text.toCharArray();

        for (char letter : letters) {
            String decodedLetter;
            if (letter == 'a' || letter == 'A') {
                decodedLetter = handleExceptionLetter(letter);
            } else {
                decodedLetter = String.valueOf((char)((int) letter - 1));
            }
            decodedLetter = changeCase(decodedLetter);
            decoded.append(decodedLetter);
        }
        return decoded.toString();
    }

    public static String changeCase(String letter)
    {
        if  (letter.equals(letter.toLowerCase())) {
            return letter.toUpperCase();
        } else {
            return letter.toLowerCase();
        }
    }

    public static String handleExceptionLetter(char letter)
    {
        String changed;
        switch(letter) {
            case 'Z': changed = "A"; break;
            case 'z': changed = "a"; break;
            case 'a': changed = "z"; break;
            case 'A': changed = "Z"; break;
            default:
                throw new IllegalStateException("Unexpected value: " + letter);
        }
        return changed;
    }
}
