//input number 7 ---> prime Number
import java.util.Scanner;
class A 
{
    public static void main(String[] args){

        int n,count=0;
        System.out.print("Enter any Number ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        for(int i=1; i<n; i++)
        {
             if(n%i==0)
             {
                 count++;
             }
        }
        if(count==2)