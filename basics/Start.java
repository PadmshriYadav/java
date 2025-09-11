/*note
------>you create a file without a package declaration,
it is automatically placed in the default package (also known as the "unnamed package").


---->When a class is part of a package (like basics)
 you must compile and run it from the parent directory of that package.

cd c:\Users\yadav\OneDrive\Desktop\java
javac basics\First.java
java basics.First

 */

package basics;

public class Start {
    public static void main(String[] args) {
        System.out.println("Hello, this is my first runnable Java program!");
    }
    
}