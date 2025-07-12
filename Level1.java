import java.util.*;
public class Main{
    public static void main(String[]args){
          int n = 5;
          System.out.println(checkPrime(n));
    }
    
    //check the given number is [rime number 
    //primenumber is divided with 1 and itself only 
    //ex:2,3,,5,7--
       
       static  boolean checkPrime(int n){
           //firstapparoach i will cehck evry number until n 
           //better approsch we only check until squareruyte like 49->7 so we only cehck 1 to 7 only so 7 si divvide 7 so it prime
           //we kno even number not prime except 2 so we rmeove even number so check onoy odd 
           if(n <= 1)return false;
           if(n==2) return true;
           if(n%2==0) return false;
           
               for(int i=3;i*i<=n;i=i+2){
                   if(n%i==0){
                       return false;
                   }
               }
               
               return true;
       }
       
       
}

2)Palindorme Number 
    public class Main {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(isPalindromeString(n));  // Output: true
    }

    // Method 1: Convert to string and compare reversed version
    static boolean isPalindromeString(int n) {
        if (n < 0) return false; // Negative numbers are not palindromes

        String str = Integer.toString(n);
        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
    }
}
//second apparoach number 
public class Main {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(isPalindromeDigits(n));  // Output: true
    }

    // Method 2: Reverse digits and compare
    static boolean isPalindromeDigits(int n) {
        if (n < 0) return false; // Negative numbers are not palindromes

        int original = n;
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return original == reversed;
    }
}







