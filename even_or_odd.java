//Find even or odd
import java.util.*;

public class even_or_odd{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:- ");
    int n= sc.nextInt();
    if (n%2==0){
        System.out.println(n+" is even.");
    }
    else{
        System.out.println(n+ " is odd.");
    }

}
}