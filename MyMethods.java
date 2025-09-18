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

    static int sum (int x ){
        return x+x;
    }

    static double sum (double x ){
        return x *3;
    }
    //Method Overloading--->exact same name, different parameter
    //return type is not part of it

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

            int s =sum (7);
             System.out.println(s);

            double t =sum ((double)7);
             System.out.println(t); 

        int [] num = {1,2,3};
        firstElemnt(num);
        System.out.println(num[0]);

    }}