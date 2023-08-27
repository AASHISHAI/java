class Addsub
{
   int n1,n2;
   public Addsub(int x,int y)
      {
          n1=x;
          n2=y;
       }
   public int add()
       {
           return(n1+n2);
       }
  public int sub();
      {
         return(n1-n2);
      }
}
   class MulDiv extends Addsub
       {
          public MulDiv(int x,int y)
             {
                 super(x,y);
             }
           public int mul()
              {
                  return(n1*n2);
              }
           public int div()
               {
                   return(n1/n2);
               }
           }
      public class Arithematicoperations
          {
               public static void main(String args[])
                   {
                      MulDiv ob=new MulDiv(20,10);
                      System.out.println("Sum=:"+ob.add());
                      System.out.println("Difference=:"+ob.sub());
                      System.out.println("Product=:"+ob.mul());
                      System.out.println("Division=:"+ob.div());
                   }
             
              
}
