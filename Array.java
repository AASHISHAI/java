import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array element");
         for(int i=0;i<n;i++)
         {
            arr[i]=sc.nextInt();
         }
         System.out.println("your enterd array elements are as follow");
         for(int i=0;i<n;i++)
         {
            System.out.println(arr[i]);
         }
         int arr2[]=new int[n];
         System.out.println("your reverse array is as follow");
            for(int i=0;i<n;i++){
                arr2[i]=arr[i];
            }
            for (int i=n-1;i>=0;i--)
            {
                System.out.println(arr2[i]);
            }

         

         
        }
    }
