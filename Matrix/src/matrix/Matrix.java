
package matrix;
public class Matrix { 
    public static void main(String[] args) {
        // TODO code application logic here
        
        //matrix
        //data abstraction
        
        //2 4
        //4 5
        
        int [][]matrixA={{1,2},{3,4}};
        int [][]matrixB={{5,6},{7,8}};
        
        for(int i=0;i<matrixA.length;i++){
            for (int j=0;j<matrixA.length;j++){
            System.out.print(matrixA[i][j]+" ");
                System.out.print(" ");
        }
            
             for (int j=0;j<matrixA.length;j++){
                 System.out.print(matrixB[i][j]+" ");
                 System.out.print(" ");
            
        }
             System.out.print(" ");
             for (int j=0;j<matrixA.length;j++){
                 System.out.print(matrixA[i][j]+matrixB[i][j]+" ");
            
        }
            System.out.println();
        
        }
        //matrix1 mt=new matrix1();
        //mt.addmatrix();
        
    }
    
}
/*class matrix1 {
    
    public void addmatrix(){
        
        
        int [][]matrixA={{1,2},{3,4}};
        int [][]matrixB={{5,6},{7,8}};
        
        for(int i=0;i<matrixA.length;i++){
            for (int j=0;j<matrixA.length;j++){
            System.out.print(matrixA[j][i]+" ");
            
        }
             for (int j=0;j<matrixA.length;j++){
                 System.out.print(matrixB[j][i]+" ");
        }
             for (int j=0;j<matrixA.length;j++){
                 System.out.print(matrixA[j][i]+matrixB[j][i]+" ");
            
        }
            System.out.println();
        
        }
    }
}*/
