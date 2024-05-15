//import java.util.Arrays;

public class SortingExample {
    public static void main(String[] args) {
        int a[]={8,9,7,6,5,10,33,25};
        int key=10;
        // System.out.println(Arrays.toString(a));
      System.out.println(key+" is found at index "+linearSearch(a,key));
    }
private static int linearSearch(int a[],int key){
    for(int i=0;i<a.length;i++){
        if(key==a[i]){
            return i;
        }
    }
    return -1;
}
    
}
