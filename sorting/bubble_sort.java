//best case time complexity=O(n);
//worst case time complexity=O(n^2);


import java.util.*;

public class sorting
{
  public static void main(String...stringsss)
  {
     Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int a[]=new int[size];
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
    
    
    int temp;
    boolean isTru=false;
    for(int i=0;i<a.length-1;i++)
    {
       for(int j=0;j<a.length-i-1;j++)
        {
    
           if(a[j]>a[j+1])
           {
                temp=a[j];
                a[j]=a[j+1];
                  a[j+1]=temp;
                  isTru=true;
            }
         }
      if(isTru==false)
      {
        //System.out.println("no sorting performed inside loop");
      break;
      }
    }
    for(int i=0;i<a.length;i++)
    {
    System.out.print(a[i]+" ");
    }
    
  }
}
