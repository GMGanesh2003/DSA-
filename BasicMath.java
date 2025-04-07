//all Basic  math problems 
// 1)count digits in an integer 
import java.util.*;
public class countdigit {
  
 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a Number");
  int n = sc.nextInt();
  int count =0;

  while(n>0){
    n = n/10;
    count = count+1;
  }
  System.out.println(count);
  sc.close();
 } 
}
//2)reverse Num 
class Solution {
    public int reverse(int x) {
     int  revNum =0;
     
     while(x!=0){
        int lastdigit = x%10;
        // check constarints conditon 
        if(revNum > Integer.MAX_VALUE/10 || revNum < Integer.MIN_VALUE/10){
            return 0;
        }
       revNum = (revNum *10)+ lastdigit;//123=0*10+3=3 like that 
        x =x/10; // because it need to go like that 123/10 = 12 and 12/10 = 1 

     }
     return revNum;
    }
}
//3)check palindrome 
class Solution {
    public boolean isPalindrome(int x) {
      int original = x;
     int  revNum =0;
     // check neagative numbers cant beacome palindrome 
     if(x<0){
        return false;
     }
     while(x>0){
        int lastdigit = x%10;
        // check constarints conditon 
        if(revNum > Integer.MAX_VALUE/10 || revNum < Integer.MIN_VALUE/10){
            return false;
        }
       revNum = (revNum *10)+ lastdigit;//123=0*10+3=3 like that 
        x =x/10; // because it need to go like that 123/10 = 12 and 12/10 = 1 

     }
     
      if(revNum == original){
        return true;
      }else{
        return false;
      }

    }
}

//4) ArmstrongNum 
import java.util.*;

public class ArmstrongNum {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number ");
    int n = sc.nextInt();
    //  armstrong -- like sum of powers -153 = 1+125+27 = 153

        int temp = n;  int sum = 0;
        while(n>0){
          int r = n%10;
          sum = sum + r*r*r;
          n = n/10;
        }
        if(sum == temp){
          System.out.println("The given is Armstrong Number");
        }else{
          System.out.println("The given Number is not a Armstrong Number" );
        }
        sc.close();
  }
}
//5) print all diviors 
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        
        ArrayList<Integer> divisors = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                divisors.add(i);
            }
        }
        
        System.out.println(divisors);
    }
}
//6)Prime Num check 
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        boolean isPrime = true;

        if(n <= 1){
            isPrime = false;
        } else {
            // We loop till √n because any non-prime number must have a factor between 2 and √n
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
// 7) GCD of a number 
import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = findGCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }

    public static int findGCD(int a, int b) {
        // Euclidean Algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
// 8) LCM of a Number -->(a*b)/gcd = lcm 
import java.util.*;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = findGCD(a, b); // First find GCD
        int lcm = (a * b) / gcd; // Then apply LCM formula

        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}



