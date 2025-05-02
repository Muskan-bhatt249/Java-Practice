import java.util.*;
public class LinearSearch{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of elements in an array- ");
        int size = sc.nextInt();
        System.out.println("Enter the values of an array- ");
        int[] array = new int[size];

        for (int j=0; j<size; j++){
            array[j]=sc.nextInt();
        }
        System.out.println("Enter element to be searched");
        int target = sc.nextInt();

        for (int i=0;i<array.length; i++){
            if(array[i]==target){
                System.out.println("Element found at index position- "+ i);
            }

        }
    }
}
