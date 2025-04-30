import java.util.*;
public class secondlargest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        if((a>b & a<c) || (a<b & a>c)){
            System.out.println("Second largest element is- " + a);
        }
        if ((b>a & b<c)|| (b<a & b>c)) {
            System.out.println("Second largest element is- "+ b);
            
        } else {
            System.out.println("Second largest element is- "+c );
        }

        
    }
}
