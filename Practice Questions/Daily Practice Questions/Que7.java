//Write a program to find common elements between two arrays.


import java.util.*;
class Main
{
 public static void main(String[] args)
 {
  int[] array1 = {4, 2, 3, 1, 6};
  int[] array2 = {6, 7, 9, 8, 4};
  List<Integer> commonElements = new ArrayList<>();
  for (int i = 0; i<array1.length; i++)
  {
  for (int j = 0; j<array2.length; j++)
  {
  if (array1[i] == array2[j])
   {
    commonElements.add(array1[i]);
    break;
   }
  }
 }
System.out.println("Common Elements: " + commonElements);
}
}