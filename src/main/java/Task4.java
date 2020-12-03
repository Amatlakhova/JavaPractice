public class Task4
{
    public static void main(String[] args)
    {
        boolean result = hasSummary(new int[]{1, 3, 2, 12, 11}, 5);
        System.out.println(result);
    }

    public static boolean hasSummary(int[] numbers, int sum)
    {
        boolean result = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == sum) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
