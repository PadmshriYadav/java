public class UsingLoops{
 public static void main (String[] args){

    for (int j=0 ;j<5;j++ ){
        if(j == 2){
            System.out.println("continuingg at 2");
            continue;
            

        }
        if(j==3){
            System.out.println("breakingg at3 ");
            break;
            
        }
        System.out.println(j);
    }

 }}