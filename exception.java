public class exception {
    public static void main(String[] args) {
        try{
            int n= 30/0; //throws an error 
        }
        catch(ArithmeticException e){
            System.out.println(e); // handles exception and runs this line

        }
        System.out.println("The code is executed correctly");
    }
}
