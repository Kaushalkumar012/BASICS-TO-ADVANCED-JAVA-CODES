public class elseif {
public static void main(String[] args) {
    int age = 13;
    if (age>=18){
        System.err.println("eligible for vote");
    }else if(age>=13 && age<18){
        System.err.println("tenager");
    }else{
        System.err.println("child");
    }
}
    
}
