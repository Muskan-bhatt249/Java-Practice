import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] array= new int[3][3];
        System.out.println("Enter elements");
        for(int i=0; i<3;i++){
            for(int j=0;j<3; j++){
                array[i][j] =sc.nextInt();

            }
        }
        System.out.println("The elements of above 2 D array is- ");
        for(int i=0; i<3;i++){
            for(int j=0;j<3; j++){
                System.out.print(array[i][j] + " ");

            }
            System.out.println("\n");
        }
    
    
    }

    
}
