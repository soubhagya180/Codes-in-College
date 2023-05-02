//Check which is maximum out of 2
import java.util.*;

public class max{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:- ");
    int a= sc.nextInt();
    System.out.println("Enter the second number:- ");
    int b= sc.nextInt();
    
    if (a>b){
        System.out.println(a+" is greater than "+b);
    }
    else if (a==b){
        System.out.println( "both are equal.");
    }
    else{
        System.out.println(b+" is greater than "+a);
    }
}
}