//variables nd datatypes
/*--->datatypes(variable in Java must have a data type)
   Primitive Data Types()
   byte,short,int,int,long,float,double,char,boolean ( stored on the stack)

   Non-Primitive Data Types( stored on the heap)
   string,array,class,interface

*---->variables

  int score = 100;
  int is the data type, score is the variable, and 100 is the valint is the data type, score is the name, and 100 is the value.
 */

public class Basics {
    public static void main(String[] args) {
        int score = 100;
        
        System.out.println("The score is: " + score); 
        // +--->string concat,combine the string "The score is: "n  the int score into a single, final string value,
        score = 150;
        System.out.print("the new score is: " );
        System.out.println(score);

        int num1 = 3;
        int num2 =4;
        int num3 = 5;
        System.out.println("the addition of num1,num2,num3 is :"+(num1+num2+num3));
    }
    
}
