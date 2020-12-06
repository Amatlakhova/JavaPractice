public class Task6
{
    public static void main(String[] args) {
        int[] numbers = {19, 76, 33, 245, 8};

        for (int number : numbers) {
            boolean result = checkTwoDigitNumber(number);
            System.out.println(result);
        }
    }

    public static boolean checkTwoDigitNumber(int number)
    {
        if (number < 10 || number > 99) {
            System.out.println(number + " is not a two-digit number.");
            return false;
        }

        int firstDigit = number / 10;
        int secondDigit = number % 10;
        return firstDigit == secondDigit || firstDigit + secondDigit == 10;
    }

}
