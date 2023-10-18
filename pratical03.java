// DBZ Program
public class pratical03 {
    public static void main(String args[]){
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division By Zero is not possible");

        }

    }
}
