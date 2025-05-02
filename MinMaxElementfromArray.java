import java.util.*;

public class MinMaxElementfromArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array- ");
        int size= sc.nextInt();
        System.out.println("enter elements");
        int[] array= new int[size];
        for (int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for (int j=0; j<array.length; j++){
            if (array[j]<min){
                min =array[j];
            }
            if(array[j]>max){
                max= array[j];
            }

        }
        System.out.println("Largest element is- "+ max );
        System.out.println("Smallest element is- "+ min);
        
    }
    
}
