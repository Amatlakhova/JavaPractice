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
            if (letter == 'Z') {
                encodedLetter = "a";
            } else if (letter == 'z') {
                encodedLetter = "A";
            } else {
                encodedLetter = String.valueOf((char)((int) letter + 1));
                if  (encodedLetter.equals(encodedLetter.toLowerCase())) {
                    encodedLetter = encodedLetter.toUpperCase();
                } else {
                    encodedLetter = encodedLetter.toLowerCase();
                }
            }
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
            if (letter == 'a') {
                decodedLetter = "Z";
            } else if (letter == 'A') {
                decodedLetter = "z";
            } else {
                decodedLetter = String.valueOf((char)((int) letter - 1));
                if  (decodedLetter.equals(decodedLetter.toLowerCase())) {
                    decodedLetter = decodedLetter.toUpperCase();
                } else {
                    decodedLetter = decodedLetter.toLowerCase();
                }
            }
            decoded.append(decodedLetter);
        }
        return decoded.toString();
    }
}
