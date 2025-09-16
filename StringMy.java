//string is immutable
import java.util.Scanner; 

public class StringMy {
    public static void main (String[] args) {
        String s3 = new String("WORld");
        // String s3 = "World";
        int len = s3.length();
        System.out.println(len);
        //5

        String sub = s3.substring(2);
        System.out.println(sub);
        //Rld

        System.out.println(s3.substring(2,4));
        //Rl
        System.out.println(s3.substring(2,5));
        //Rld

    
        // System.out.println(s3.substring(2,6));...error

        System.out.println(s3.replace('w','l'));
        //WORld ...case sesitive

        System.out.println(s3.replace('W','l'));
        // lORld
        System.out.println(s3.replace("Rld","n"));//" " 
        //WOn

        System.out.println(s3.startsWith("wo"));
        //false...case sentt

        String lower = s3.toLowerCase();
        System.out.println(lower);//world

        System.out.println(s3.charAt(2));//R
        

        String name ="padmshshshri";
        System.out.println(name.indexOf("sh"));//4
        System.out.println(name.indexOf("sh",6));//6 
        System.out.println(name.indexOf("xyz")); //-1   

        String fullLine = "   noise canceling audio for deaf   ";//removes start-end spaces
        System.out.println(fullLine.trim());
        
        System.out.println(s3.equals("WORld"));//true
        System.out.println(s3.equalsIgnoreCase("world"));//true


        float a = 6f;
        System.out.format("the float number is %f\n",a);
        Scanner scanner = new Scanner (System.in);
        // String st = scanner.next();
        System.out.print("enter color:");
        String st = scanner.nextLine();
         System.out.println("color is " +st);
    scanner.close();
    }
}