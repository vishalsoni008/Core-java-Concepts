public class TwoD {
    public static void main(String[] args) {
     int[][] arr=new int[5][4];
     int i,j,k=0;
    
     for(i=0;i<4;i++){
         for(j=0;j<i+1;j++){
             arr[i][j]=k;
             k++;
         }
     }
     for(i=0;i<4;i++){
         for(j=0;j<i+1;j++){
             System.out.print(arr[i][j]+" ");
         }
         System.out.println();
     }
    }
}
