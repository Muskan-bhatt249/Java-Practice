import java.util.*;
class Factorial{
public static void fact(int n){
if(n<0){
System.out.println("The entered number is Negetive");
}
int factorial =1;
for (int i=n; i>=1; i--)
{
factorial =factorial *i;
}
System.out.println("The factorial of the given number is =" + factorial);
return;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
fact(num);

}
}
