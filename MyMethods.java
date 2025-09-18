public class MyMethods{
    static int sum (int x , int y){
        int num;
        if (x > y){
            num = x+y;
        } else{
            num =(x+y)*5;
        }
        return num;
    }

    static void firstElemnt(int [] array){
        array[0]=60;
    }

    static void greet(){
         System.out.println("mrng ");

    }


    public static void main (String[] args){
            int a = 20;
            int b =30;
            int c = sum(a,b);
            System.out.println(c);
            greet();

        int [] num = {1,2,3};
        firstElemnt(num);
        System.out.println(num[0]);



    }}