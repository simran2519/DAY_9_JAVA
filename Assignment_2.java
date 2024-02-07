//Given a string inputString and a list of words wordsList, determine if inputString can be divided into a sequence of one or more words from wordsList, with spaces inserted between words. The same word from wordsList can be used multiple times in the division.
//        For inputString = "Avisoft" and wordsList = ["Avi", "soft"], the function should return true because "Avisoft" can be divided as "Avi soft".
//        For inputString = "jammukashmirjammu" and wordsList = ["jammu", "kashmir"], the function should return true because "jammukashmir" can be divided as "jammu kashmir jammu", and it's allowed to reuse words from wordsList.
//        For inputString = "catsandog" and wordsList = ["cats", "dog", "sand", "and", "cat"], the function should return false since there's no way to divide "catsandog" using the words from wordsList that matches the entire string.
//        The length of inputString is between 1 and 300 characters.
//        The size of wordsList is between 1 and 1000.
//        Each word in wordsList has a length between 1 and 20 characters.
//        inputString and each word in wordsList consist only of lowercase English letters.
//        All words in wordsList are unique.
//        Determine if the given inputString can be fully segmented into a sequence of one or more words from the provided wordsList.
package DAY_9;
import java.util.Scanner;
public class Assignment_2
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of wordList");
        int n=sc.nextInt();
        System.out.println("Enter the words");
        String arr[]= new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.next();
        }
        System.out.println("Enter the String");
        String str=sc.next();

        int flag=0;
        int last=0;
        String s="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            s=s+ch;
            for(int j=0;j<arr.length;j++)
            {
                if(s.equals(arr[j])&& i!=str.length()-1)
                {
                    s="";        //Empty the string for checking next remaining string
                    flag=1;
                }
                if(s.equals(arr[j]) && i==str.length()-1)
                {
                    last=1;       //for the last character
                }
            }
        }
        if(flag==1 && last==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
