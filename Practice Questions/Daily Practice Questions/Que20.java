//Write a program to find a word in a given string that has the highest number of repeated letters. If not found, return -1.


class HighestRepeatedLetters
{
public static void main(String args[])
{
 String inputString = "My College name is Sipna College of Engineering";
 String wordWithHighestRepeatedLetters = findWordWithHighestRepeatedLetters(inputString);
 if (wordWithHighestRepeatedLetters.equals(""))
{
 System.out.println(-1);
 }
else
{
 System.out.println("Word with highest repeated letters: " + wordWithHighestRepeatedLetters);
 }
}

public static String findWordWithHighestRepeatedLetters(String inputString)
{
 String[] words = inputString.split("\\s+");
 String resultWord = "";
 int maxRepeatedLetters = 0;
 for (String word : words) {
 int[] letterCounts = new int[26];
 int maxCount = 0;

  for (char c : word.toCharArray()) {
   if (Character.isLetter(c)) {
    letterCounts[Character.toLowerCase(c) - 'a']++;
     if (letterCounts[Character.toLowerCase(c) - 'a'] > maxCount)
     {
      maxCount = letterCounts[Character.toLowerCase(c) - 'a'];
      }
     }
    }
    if (maxCount > maxRepeatedLetters)
    {
      maxRepeatedLetters = maxCount;
        resultWord = word;
    }
   }
 return resultWord;
 }
}





