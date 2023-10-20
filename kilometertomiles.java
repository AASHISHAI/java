import java.util.*;
 class kilometertomiles {
    public static void main(String args[]){
        System.out.println("Enter the number to converting : ");
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = (km*0.621371);
        System.out.println("The converted number : "+miles);

    }
    
}
