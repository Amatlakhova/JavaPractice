import java.util.ArrayList;
import java.util.List;

public class Task3
{

    public static void main(String[] args)
    {
        List<String> parsedWords = parseWords(new String[]{"apple banana", " orange", "banana", "kiwi strawberry blueberry"});
        System.out.println(parsedWords);
    }

    public static List<String> parseWords(String[] unparsedWords)
    {
        List<String> parsedWords = new ArrayList<>();

        for (String unparsedWord : unparsedWords) {
             String[] newWords = unparsedWord.split(" ");
             for (String newWord : newWords) {
                 if (!newWord.isEmpty()) {
                     parsedWords.add(newWord);
                 }
             }
        }
        return parsedWords;
    }

}
