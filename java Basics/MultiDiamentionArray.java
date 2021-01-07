public class MultiDiamentionArray {
    public static void main(String[] args) {
        int[][] arr1=new int[5][5];
       // int[] arr2=new int[5];
       int k=0;

       for(int i=0;i<5;i++){
           for(int j=0;j<5;j++){
               arr1[i][j]=k;
               k++;
           }
       }

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
