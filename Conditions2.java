import java.util.Scanner;


public class Conditions2 {
 public static void main (String[] args){
     int num3 = 3;
     int num;

        switch (num3) {
            case 1:
                num = 1;
                break;
            case 2:
                num = 2;
                break;
            case 3:
                num = 3;
                break;
           
            default:
                 num = -1;
                System.out.println("nott valid");
        }
        System.out.println("number " + num );
//---------------------------------------------------------
        Scanner sc = new Scanner (System.in);

        System.out.println("enter name");
        String name = sc.nextLine();

        switch (name.toLowerCase()) {
            case "padmshri" -> System.out.println("its padmshri");  

            case "shreya" ->  System.out.println("its shreya");         
           
            default -> System.out.println("nott found");
        }
        




 }
 }