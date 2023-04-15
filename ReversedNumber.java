import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number=");
        int n = sc.nextInt();

int rev = 0 ;

 while(n>0)
 {
rev=rev*10 +n%10;       // 0*10 + 987%10=7   7*10=70+98%10=78 
n=n/10;                  // 987/10=98         98/10=9 
 }
System.out.println("Reversed no="+rev);
 

        }



    }

 
