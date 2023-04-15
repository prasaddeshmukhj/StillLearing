import java.util.Scanner;

class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
        int rev = 0;
        int org_num=n;
        while(n>0)
        {
            rev=rev*10 + n%10;
            n=n/10;           
        }
        if (org_num==rev)
        {
        System.out.println("Number is Palindrome");
    }
    else
    {
        System.out.println("Number is not Palindrome");
    }

    }
}