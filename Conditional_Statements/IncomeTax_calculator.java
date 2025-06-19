/*income<5l
0% tax
income between 5-10lakhs
20%tax
income>10lakhs
30%tax */
import java.util.Scanner;
public class IncomeTax_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int tax;
        if(salary<=500000){
            tax =0;
        }else if (salary > 500000 && salary <= 1000000){
            tax= (int) (salary*0.2);
        }else{
            tax =(int) (salary*0.3);
            
        }  System.out.println("Your tax is: " + tax);

        
    }

    
}
