import java.util.*;
public class Transpose {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter array size");
        int x= sc.nextInt();
        int y= sc.nextInt();
        int [][] array = new int [x][y];
        System.out.println("Enter array elements- ");
        for (int i=0; i<x;i++){
            for (int j=0; j<y; j++){
                array[i][j]= sc.nextInt();
            }
        }
        int [][] array1 =new int[y][x];

        for (int i=0; i<x;i++){
            for (int j=0; j<y; j++){
                array1[j][i] =array[i][j];
            }
        }
        System.out.println("The new array");

        for (int i=0; i<y;i++){
            for (int j=0; j<x; j++){
                System.out.print(array1[i][j] + " ");
            }
            System.out.println("\n");
        }
    

    }
    
}
