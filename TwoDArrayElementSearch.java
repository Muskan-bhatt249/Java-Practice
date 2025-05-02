import java.util.*;
public class TwoDArrayElementSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] array= new int[3][3];
        System.out.println("Enter elements");
        for(int i=0; i<3;i++){
            for(int j=0;j<3; j++){
                array[i][j] =sc.nextInt();

            }
        }

        System.out.println("Enter element to be found- ");
        int target =sc.nextInt();
        for(int i=0; i<3;i++){
            for(int j=0;j<3; j++){
                if(target == array[i][j]){
                System.out.println("Number found at- " +i +"&" +j );
                }

            }
          
        }
    
    
    }

    
}
