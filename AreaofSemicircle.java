import java.util.*;

public class AreaofSemicircle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of r : ");
        int radius=sc.nextInt();
        double Semicircle=((3.14*radius*radius)/2);
        System.out.println("The Area of Circle is :"+Semicircle);
    }
    
}
