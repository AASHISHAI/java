import java. util.*;
class payoutofBoundsException extends Exception
{
  payoutofBoundsException(String msg)
    {
        System.out.println("payout of bounds exception"+ msg);
    }
}
 public class UDE
    { 
       public static void main(String args[])throws payoutofBoundsException
        {
           System.out.println("Enter the employee salary:");
            Scanner sc=new Scanner(System.in);
             int pay=sc.nextInt();
              if(pay<10000||pay>50000)
                  {
                   throw new payoutofBoundsException(" Salary not in a valid range");
                  }
                     else
                    
                       System.out.println("Employee is eligible for 30% hike");
                    
 }
}		