import java.util.*;

public class palindrome{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:- ");
    int n=sc.nextInt();
    int temp=n;
    int rev=0,rem=0;
    while (temp>0){
        rem=temp%10;
        rev=rev*10+rem;
        temp/=10;
    }
    // System.out.println(rev);
    if (rev==n){
        System.out.println(n+" is a Palindrome number.");
    }
    else {
        System.out.println(n+" is not a Palindrome number because its reverse number is "+rev+".");
    }
}
}