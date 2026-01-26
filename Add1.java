import java.util.*;
public class Add1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int result = 0 ; 
        int place = 1 ;
        while(num > 0)
        {
            int digit = num % 10 ;
            digit = (digit+ 1) % 10 ;
            result += digit * place ;
            place *= 10 ;
            num /= 10 ;
        }
        System.out.println("Result after adding one to each digit : " + result);
    }
}