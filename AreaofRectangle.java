import java.util.*;
public class AreaofRectangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float l,b;
        System.out.println("Enter the length and breadth of rectangle : ");
         l=sc.nextFloat();
         b=sc.nextFloat();
        float area=(l*b);
        System.out.println("The area of rectangle :"+area);
    }
    
}
