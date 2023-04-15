class Swapping{
public static void main(String[] args) {

    int a=10;
    int b=30;
    
    b=a+b;
    a=b-a;
    b=b-a;


    System.out.println("swapped numbers are a = " + a +" b = "+b);
/*
 * a=10;      
 * b=20
 * temp=a ; temp=10,a=10,b=20
 * a=b ; a=20 b=20 temp=10
 * b=temp ; b=10 
 * 
 * 
 * a=10
 * b=15
 * b=a+b   b=25 a=10
 * a=b-a    a=15,b=25
 * b=b-a  b10 a=15
 * 
 * a=10
 * b=20
 * a=a*b      10*20=200 b=20 a=200
 * b=a/b       b=10 a=200
 * a=a/b       a=20 b=10
 * 
 * 
 * 
 */


}
}