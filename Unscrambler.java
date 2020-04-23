import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Unscrambler
{
    public static void main(String args[]) throws FileNotFoundException 
    {
        File f = new File("C:\\Users\\NiceTry\\Desktop\\prgTHINGS\\Java THINGS\\word scrambler\\words_alpha.txt");
        Scanner scanner = new Scanner(f);
        Scanner inputScanner = new Scanner(System.in);

        String characters = inputScanner.nextLine();

        String winningString = "";
        int length = 0;
        

        while(scanner.hasNextLine())
        {
            String tempWord = scanner.nextLine();
            if (contains(tempWord, characters) && tempWord.length() > length)
            {
                winningString = tempWord;
                length = tempWord.length();
            }
        }
        System.out.println(winningString);
    }

    public static boolean contains(String word, String characters)
    {
        for (char i: word.toCharArray())
        {
            if (characters.indexOf(i) != -1)
            { 
                characters = charRemoveAt(characters, characters.indexOf(i));
                continue;
            }
            return false;
        }
        return true;
    }

    public static String charRemoveAt(String str, int p) {  
        return str.substring(0, p) + str.substring(p + 1);  
     }  
}