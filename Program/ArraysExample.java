
public class ArraysExample {
   public static void main(String[] args) {
    int arr[]=getArray();
    for(int i:arr){
        System.out.println(i);
    }
   }

private static int[] getArray(){
    return new int[]{10,20,30,40};
}
}
