import java.util.*;

public class reverse{
public static void main(String[] args){
    Scanner sc =
    int temp=n;
    int rev=0,rem=0;
    while(temp>0){
        rem=temp%10;
        rev=rev*10+rem;
        temp=temp/10;

    }
    System.out.println(rev);
}
}