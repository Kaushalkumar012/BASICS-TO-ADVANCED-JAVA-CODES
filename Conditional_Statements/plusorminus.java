import java.util.Scanner;
public class plusorminus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        if( x > 0){
            System.out.println("Positive number");
        }else if (x<0) {
            System.out.println("Negative number");
        } 
    }
}
