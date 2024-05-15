import java.util.*;

public class LongestSubArray {
  public static void main(String[] args) {
    int a[]={5,4,1,1,3,3,3,2,2,2,2};
    int b[]=findLongest(a);
    for(int num:b){
        System.out.println(num+" ");
    }
  }

private static int[] findLongest(int[] a) {
    //Map<Integer,Integer> countMap=new HashMap<>();
    Map<Integer,Integer> countMap=new HashMap<>();
    int max=0;
    int start=0,end=0;
    for(int i=0;i<a.length;i++){
        int num=a[i];
        countMap.put(num,countMap.getOrDefault(num, 0)+1);

        if(countMap.get(num)>max){
            max=countMap.get(num);
            start=i-max+1;
            end=i;
        }
    }
    int[] longest=new int[max];
    for(int i=start;i<=end;i++){
        longest[i-start]=a[i];
    }
    return longest;
}
}
