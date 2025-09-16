public class Conditions {
 public static void main (String[] args){

int age = 20;
boolean a = true;
boolean b= false;
boolean c= false;

if (age >= 18) {
    System.out.println("eligible ");
} else {
    System.out.println(" not  eligible");
}
 
//&&) requires all true
 if (a && b && c) {
    System.out.println("all r true");
}
//||) requires one of all true
else if (b||c){
    System.out.println("one of it is true");

} else {
    System.out.println("one or all f them is false");
}

 }
}
// eligible 
// one or all f them is false