import java.util.Scanner; 

public class MyArray{
    public static void main (String[] args){
        Scanner array = new Scanner(System.in);
        //dataType[] arrayName;....items must be of the same type
        //arrayName = new dataType[size];
        String [] colors = new String[3];
        colors[0] = "red";
        colors[1] = "blue";
        colors[2] = "yellow";

        //  System.out.println(colors);..error
        System.out.println(colors[2]);

        String [] color = {"greeen","pink","black"};
        System.out.println(color.length);

        //display
        for (int i=0; i< color.length; i++){
            System.out.println(color[i]); }

        // for (dataType item : arrayName) { }
        int [] roll = {137,136,134};
        for (int eachRoll : roll){
            System.out.println(eachRoll);

        }
        

        

    }
} 