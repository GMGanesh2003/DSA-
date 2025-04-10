1) Print something N times using recursion
public class PrintName {
    static void print(int n) {
        if (n == 0) return;
        System.out.println("Ganesh");
        print(n - 1);
    }

    public static void main(String[] args) {
        print(5); // prints "Ganesh" 5 times
    }
}



🧠 Logic: Keep reducing n, stop at 0.

✅ 2. Print 1 to N using recursion
java
Copy
Edit
public class Print1ToN {
    static void print(int i, int n) {
        if (i > n) return;
        System.out.println(i);
        print(i + 1, n);
    }

    public static void main(String[] args) {
        print(1, 5); // prints 1 to 5
    }
}


✅ 3. Print N to 1 using recursion
java
Copy
Edit
public class PrintNTo1 {
    static void print(int n) {
        if (n < 1) return;
        System.out.println(n);
        print(n - 1);
    }

    public static void main(String[] args) {
        print(5); // prints 5 to 1
    }
}


✅ 4. Sum of first N numbers
java
Copy
Edit
public class SumOfN {
    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5)); // output: 15
    }
}


✅ 5. Factorial of N numbers
java
Copy
Edit
public class Factorial {
    static int fact(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5)); // output: 120
    }
}


✅ 6. Reverse an array using recursion
java
Copy
Edit
import java.util.Arrays;

public class ReverseArray {
    static void reverse(int[] arr, int i, int j) {
        if (i >= j) return;
        // swap
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        reverse(arr, i + 1, j - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr)); // [5, 4, 3, 2, 1]
    }
}


✅ 7. Check if a string is palindrome
java
Copy
Edit
public class Palindrome {
    static boolean isPalindrome(String s, int i) {
        int n = s.length();
        if (i >= n / 2) return true;
        if (s.charAt(i) != s.charAt(n - i - 1)) return false;
        return isPalindrome(s, i + 1);
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str, 0)); // true
    }
}

⚠️ 8. Fibonacci Number using recursion (Be careful: this is exponential time)
java
Copy
Edit
public class Fibonacci {
    static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(6)); // output: 8
    }
}
