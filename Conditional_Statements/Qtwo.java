import java.util.Scanner;
public class Qtwo {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        if (x<100){
            System.out.println("Low fever");
        } else if( x>100){
             System.out.println("High fever");
        }
    }
}
