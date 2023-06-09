package Task2;

import java.util.Scanner;

public class WordsCount {
    /*
    Условие:
    Пребройте колко думи има в един стринг (разделете текста по space)
    изпишете резултата в нея.
 */
    public static int
    countWords(String str)
    {

        // Check if the string is null
        // or empty then return zero
        if (str == null || str.isEmpty())
            return 0;

        // Splitting the string around
        // matches of the given regular
        // expression
        String[] words = str.split("\\s+");

        // Return number of words
        // in the given string
        return words.length;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        // Print the result
        System.out.println("No of words : " +
                countWords(str));
    }
}
