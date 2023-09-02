import java.util.*;

public class AreaOfCircle {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the r value : ");
        float r=sc.nextFloat();
        double area=(3.14*r*r);
        System.out.print("The area of circle is :");
        System.out.println(area);
    }
    
}
