import java.util.*;

public class armstrong{
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number(0-999):- ");
    int n=sc.nextInt();
    int temp=n;
    int rem=0,arm=0;
    while (temp>0){
        rem=temp%10;
        arm=arm+(rem*rem*rem);
        temp/=10;
    }
    if (arm==n){
        System.out.println(n+" is a armstrong number.");
    }
    else {
        System.out.println(n+" is not a palindrome number. \nBecause its sum of the cube of the digits is "+arm+".");
    }

}
}
