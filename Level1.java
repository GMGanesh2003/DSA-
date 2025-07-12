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
