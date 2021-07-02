//best case time complexity is-->O(n)
//worse case time complexity is-->O(n^2)

import java.util.*;
public class sorting
{
public static void main(String...aaaaa)
{
Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  int a[]=new int[size];
  for(int i=0;i<a.length;i++)
  {
    a[i]=sc.nextInt();
  }
  
  for(int i=1;i<a.length;i++)//------->since we have to compare the 2nd element with the first we took i=1 not 0 
  {
  int temp=a[i];
    j=i-1;
    while(j>=0 && a[j]>temp)
    {
    a[j+1]=a[j];
      j--; //or we can simply write j=j-1; same meaning..
    }
    a[j+1]=temp; //---------->since we are decreasing j with -1 to compare if previous element is greater or not so now j has become - towards -ve indexing so we have to make j +ve therefore,j+1 we have written... 
  }
  
  
  
  //now simply print the array...
  for(int i=0;i<a.length;i++)
  {
  system.out.print(a[i]+"  ");
  }
  
  
  
}
}
