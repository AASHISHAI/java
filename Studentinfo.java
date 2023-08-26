import java.util.*;
class Student
{
    Scanner sc=new Scanner(System.in);
    String E_id;
    String name;
    int S1,S2,S3,total;
     Student()
       {
           readStudentinfo();
       }
          public void readStudentinfo()
            {
                System. out.println("Enter the Student details:");
                System. out.println("Enter the Enrollment number:");
                E_id=sc.next();
                System. out.println("Enter the Student name");
                name=sc.next();
                System. out.println("Enter the Student marks in 3 subjects:");
                S1=sc.nextInt();
                S2=sc.nextInt();
                S3=sc.nextInt();
                if(S1>=50&&S2>=50&&S3>=50)
                total=S1+S2+S3;
                else
                 total=0;
               }
                  public void displayinfo()															            {
			System.out.println(E_id+"  "+name+"  "+total);
}		     }
        
   public class studentinfo
{
	   public static void main(String args[])
		{
                    Student  S[] =new Student[3];
		    for(int i=0;i<3;i++)
	             S[i]=new Student();
                    System.out.println("Student Details");
                   System.out.println("Enrollment no." + " Name " + " Total");
                   for(int i=0;i<3;i++)
                   S[i].displayinfo();
                }
}
