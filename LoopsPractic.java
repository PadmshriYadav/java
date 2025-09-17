import java.util.Scanner; 

public class LoopsPractic{
 public static void main (String[] args){

    //factorial of number
    Scanner num = new Scanner(System.in);
    int num1,fact=15;
    System.out.print("enter number in order to find its factorial");
    num1 = num.nextInt();

    for (int i = 1; i<=num1; i++){
         fact*=i;

    }
     System.out.print(" its factorial is :" + fact);
      System.out.print("\n"); 
     num.close();5
     

    //pattern
    
     for (int i = 1; i <= 5; i++) {
          for (int j = 5; j >= i; j--) {
           System.out.print("*");
    }
    System.out.print("\n"); 
}


 }
 }