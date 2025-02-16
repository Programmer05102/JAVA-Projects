package multimatrix;
public class Multimatrix {
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][]matrixA={{1,2,3},{3,4,5},{5,6,7}};
        int [][]matrixB={{5,6,7},{3,4,5},{1,2,3}};
        int [][]matrixC= new int[3][3];
        
        for(int i=0;i<matrixA.length;i++){
            for(int j=0;j<matrixB.length;j++){
                System.out.print(matrixA[i][j]);
                System.out.print(" ");
            }
            System.out.print("  ");
            
            for(int j=0;j<matrixB.length;j++){
                System.out.print(matrixB[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        
         for(int i=0;i<matrixA.length;i++){
            for(int j=0;j<matrixB.length;j++){
                //matrixC[i][j]=0;
                for(int k=0;k<3;k++){
                    matrixC[i][j]+=matrixA[i][k]*matrixB[k][j];
                }
                System.out.print(matrixC[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}