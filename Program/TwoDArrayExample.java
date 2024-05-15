public class TwoDArrayExample {
    public static void main(String[] args) {
        int a[][]=new int[2][5];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){               
                System.out.println(a[i][j]);
            }
        }
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int[] row:array){
            for(int element:row){
                System.out.println(element+" ");
            }
            System.out.println();
        }

    }
}
