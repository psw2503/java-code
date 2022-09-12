import java.util.Scanner;
class Sum
{
    Public static void main(String[]args)
  
    int n,rsum=0;
    System.out.print("Enter any Number");
    Scanner ref=new Scanner(System.in);
    n=ref.nextInt();
 
    while(n>0)
    {
        r=n%10;
        sum=sum+r;
        n=n/10;
    }
    System.out.print("Sum od Digits "+ sum);
 }

}
