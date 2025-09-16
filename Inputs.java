import java.util.Scanner; // Import the Scanner class

public class Inputs{

    public static void main(String[] args) {
         //Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        /*
        nextLine() reads the entire line of input (+spaces) until \n is found..used for reading strings

        next() : Reads only a single word

        nextInt() : read integer from the input

        nextDouble() : Reads the next double from the input

        nextBoolean() : Reads the next boolean from the input. */
        
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
    
        System.out.println(name);
    
        System.out.print("you want candy?");

        String singleAnswr= scanner.next();

        System.out.println("you said:"+ singleAnswr);       
       //.hasNext()---> checks if there is another token( word, number) available in the input stream
       //call hasNext() on the Scanner object, not on the variables
       //checks for more data --> returns true.-->returns false
      
        System.out.println("more input waiting? " + scanner.hasNext());
        System.out.print("enter a num :") ;

        // prevents the prblm
        // String dummy = scanner.next();

        int num = scanner.nextInt();

        System.out.println("num is:"+ num);

        scanner.close();
    }
}
