//* given an array we have to find the element whose occurence is more than size/2 times
//multiple ways we can choose but best time & space complexity for this algorithm is O(n)-->time ,O(1)-->for space!!!!....

public class ARRAYS
{
public static void main(String...strings)
{
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int a[]=new int[size];
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}

int index=0;
int count=1;
for(int j=1;j<a.length;j++)
{
if(a[j]==a[index])
{
count++;
}
else
{
count--;
}

if(count==0)
{
index=j;
count=1;
}

}
//int jisko_check_krna_h=a[index];
int COUNT=0;
for(int i=0;i<a.length;i++)
{
if(a[i]==a[index])
{
COUNT++;
}
if(COUNT>size/2)
{
System.out.println(a[i]);
return;
}
}
System.out.println("no element greater than size/2 times");
}}
