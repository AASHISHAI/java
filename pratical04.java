//UDE program
//payoutofBoundsexception
import java.util.*;
class UD extends Exception {
    UD(String msg)
    {
        System.out.println("pay out of Bounds exception"+msg);

    }
}
public class pratical04{
    public static void main(String args[]) throws payoutofBoundsException{
        System.out.println("Enter the employee salary:");
        Scanner sc=new Scanner(System.in);
        int pay =sc.nextInt();
        if(pay<10000|| pay>50000)
    {
       throw new payoutofBoundsException("salary not in a valid range");

    }
    else{
        System.out.println("Employee is eligible for 30% hike");

    }
}

    

}
