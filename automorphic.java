import java.util.*;

public class automorphic{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:- ");
    int n=sc.nextInt();
    int c=n*n;
    int temp=c;
    int temp3=n;
    int i=0;
    int j=0;
    int rem=0,rev=0;
    // System.out.println(temp);
    // to get the number of digits in n
    while(temp3>0){
        temp3/=10;
        i++;
    }

    // System.out.println(i);
    while(j<i){
        rem=temp%10;
        rev=rev*10+rem;
        temp=temp/10;
        j++;
    }
    // System.out.println(rev);

    int temp2=rev;
    int rev2=0;
    while(temp2>0){
        rem=temp2%10;
        rev2=rev2*10+rem;
        temp2=temp2/10;
        j++;
    }
    // System.out.println(rev2);

    if (rev2==n){
        System.out.println(n+" is automorphic number \nBecause its square is "+c+".\nAnd the last "+i+" digits = "+rev2);
    }
    else{
        System.out.println(n+" is not automorphic number \nBecause its square is "+c+".\nAnd the last "+i+" digits = "+rev2);
    }
}
}