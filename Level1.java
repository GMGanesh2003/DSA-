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

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 153;
        System.out.println("Prime: " + isPrime(n));
        System.out.println("Palindrome: " + isPalindrome(n));
        System.out.println("Reverse: " + reverse(n));
        System.out.println("Sum of Digits: " + sumOfDigits(n));
        System.out.println("Factorial: " + factorial(n));
        System.out.println("Fibonacci (n terms): " + fib(n));
        System.out.println("Power of 2: " + isPowerOfTwo(n));
        System.out.println("GCD of 12 & 18: " + gcd(12, 18));
        System.out.println("LCM of 12 & 18: " + lcm(12, 18));
        System.out.println("Armstrong: " + isArmstrong(n));
        System.out.println("Set Bits in " + n + ": " + countSetBits(n));
    }

    // Prime Number
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0) return false;
        return true;
    }

    // Palindrome Number
    static boolean isPalindrome(int n) {
        if (n < 0) return false;
        int rev = 0, original = n;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev == original;
    }

    // Reverse Number
    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    // Sum of Digits
    static int sumOfDigits(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Factorial
    static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    // Fibonacci (nth term)
    static int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, c = 1;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    // Power of 2
    static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    // GCD
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // LCM
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Armstrong Number
    static boolean isArmstrong(int n) {
        int original = n, sum = 0;
        int digits = String.valueOf(n).length();
        while (n > 0) {
            int r = n % 10;
            sum += Math.pow(r, digits);
            n /= 10;
        }
        return sum == original;
    }

    // Count Set Bits (Brian Kernighan)
    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}






