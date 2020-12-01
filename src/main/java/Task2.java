public class Task2
{
    public static void main(String[] args)
    {
        analyzeText(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                25
        );
    }

    public static void analyzeText(String text, int maxLength)
    {
        /* Action 1 */
        int length = text.length();
        System.out.println("Total number of characters in a text = " + length);

        /* Action 2 */
        int lengthNoSpaces = text.replace(" ", "").length();
        System.out.println("Total number of characters in a text excluding spaces = " + lengthNoSpaces);

        /* Action 3 */
        boolean isEven = length % 2 == 0;

        if (isEven) {
            System.out.println("Number of characters in the text is even.");
        } else {
            System.out.println("Number of characters in the text is odd.");
        }

        /* Action 4 */
        if (length > maxLength) {
            System.out.println("Total number of characters in a text (" + length + ") exceeds maximum allowed text length (" + maxLength + ")");
        }
    }

}
