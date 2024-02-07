//Given a collection of string elements stringArray, organize the elements into groups where each group consists of strings that are anagrams of each other. An anagram is defined as a word or phrase that is created by rearranging the letters of another word or phrase, using all original letters exactly once. The solution can present the groups in any sequence.
//
//        For stringArray = ["eat", "tea", "tan", "ate", "nat", "bat"], the output should be [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]. Each subgroup contains words that are anagrams of each other.
//        For stringArray = [""], the output should be [[""]]. The array contains only one element that is an empty string, thus it forms a group by itself.
//        For stringArray = ["z"], the output should be [["z"]]. Since there's only one string with one letter, it forms a group on its own.
//        The length of stringArray is between 1 and 10^4.
//        The length of each string in stringArray is between 0 and 100.
//        Each string in stringArray consists of lowercase English letters.
//        Your task is to group all the anagrams together from the given stringArray and return the grouped anagrams in any order.
package DAY_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment_1
{
    public static void main(String[] args)
    {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        String arr[]= new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        String g="";
        if(arr.length==0)
        {
            System.out.println(g);
        }
        else
        {
            String Barr[]=new String[n];
            int check[]=new int[n];
            for(int i=0;i<arr.length;i++)      //Sorting the characters and putting them in another array
            {
                String str=arr[i];
                char arr1[]=str.toCharArray();
                Arrays.sort(arr1);
                str=String.valueOf(arr1);
                Barr[i]=str;

            }
            for(int i=0;i<n;i++)  //Checking for the anagrams in 2nd array and putting the anagrams into Arraylist
            {
                ArrayList<String> list = new ArrayList<>();
                for(int j=0;j<n;j++)
                {
                    if(Barr[i].equals(Barr[j]))
                    {
                        if(check[j]==0)      //to check if the element has already been putted int the arraylist
                        {
                            list.add(arr[j]);
                            check[j]=-1;
                        }
                    }
                }
                if(list.size()!=0)     //to avoid printing the empty arrayListt
                {
                    System.out.println(list);
                }
            }
        }

//        for(int i=0;i<n;i++)
//        {
//            System.out.println(Barr[i]);
//        }

    }
}
