
//best and worse case time complexity are O(n^2)
//space would be constant....

import java.util.*;
public class sorting
{
public static void main(String...ssss)
{
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  int a[]=new int[size];
  for(int i=0;i<a.length;i++)
  {
  a[i]=sc.nextInt();
  }
  
  for(int i=0;i<a.length-1;i++) //--->since after n-1 iterations biggest element would be at its correct location no need to traverse n times. 
  {
  int minimum_index=i;
    for(int j=i+1;j<a.length;j++) 
    {
    if(a[j]<a[minimum_index])
    {
    minimum_index=j;//----------->if any index value of j is minimum than our considered value just we need to swap the element..
    }
    }
    if(minimum_index!=i)//---------------->after full execution of above (for loop j one) it founds that if no value is minimum than considered so swap these values we got
    {
    int temp=a[i];
      a[i]=a[minimum_index];
      a[minimum_index]=temp;
    }
  }
  for(int i=0;i<a.length;i++)
  {
  System.out.print(a[i]+"  ");
  
  }
    
  
  
}


}
