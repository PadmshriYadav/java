public class MyArray2{
    public static void main (String[] args){
    //dataType[][] arrayName = new dataType[rows][columns];
     int[][] matrix1 = new int[2][3];
     matrix1[0][0]=10;
     matrix1[0][1]=20;
     matrix1[0][2]=30;
     
    // 2x3
     int[][] matrix2 = {{1,2,3},
                        {4,5,6}};

    for ( int i=0; i<2;i++){
        for (int j=0;j<3;j++){
            System.out.println( matrix2[i][j]);
        }
    }

    }
}