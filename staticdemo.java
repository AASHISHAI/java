
class Student
{
  static String Collegename="PES";
  int rollno;
  String name;
  Student(int rollno,String name)
   {
       this.rollno=rollno;
       this.name=name;
   }
      void display()
         {
             System.out.println(Collegename+" "+rollno+" "+name);
         }
 
}
        public class staticdemo
            {
               public static void main(String args[])
                  {
                       System.out.println("Objects sharing static variable:collegename");
                        Student S1=new Student(101,"Suhas");
                        Student S2=new Student(102,"Sneha");
                         S1.display();
                         S2.display();
                         System.out.println("Static variable changed by one of the object");
                         S1.Collegename="BMS";
                         S1.display();
                         S2.display();
                    }
}
                