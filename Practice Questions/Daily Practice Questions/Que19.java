// Find the index of two array elements whose sum is equal to the given value.


import java.util.*;
class IndexWithSumExample
{
public static void main(String args[])
{
 int[] nums = {1,2,3,7,6,3,3,9,2,3};
 int target = 8;
 
 Map<Integer, String>map = new HashMap<>();
 List<String> ans = new ArrayList<>();
 for (int i=0; i<nums.length; i++)
 {
  int requiredNum=target - nums[i];
  if(map.containsKey(requiredNum))
  {
   String[] s=map.get(requiredNum) != null ? map.get(requiredNum).split(",") : new String[1];
   if(s.length>1)
   {
    String s1=s[0]+","+i;
    String s2=s[1]+","+i;
    map.put(nums[i],s1);
    map.put(nums[i],s2);
    ans.add(s1+" : "+"("+nums[i]+","+requiredNum+")");
    ans.add(s2+" : "+"("+nums[i]+","+requiredNum+") ");
   }
   else
   {
    map.put(nums[i],map.get(requiredNum)+","+i);
    ans.add(map.get(nums[i])+" : "+"("+nums[i]+","+requiredNum+")");
   }
  }
  else
  {
   map.put(nums[i],String.valueOf(i));
  }
 }
 for (String a : ans)
{
 System.out.println(a);
 }
}
}