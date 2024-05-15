import java.util.Arrays;

public class MaxSubString {
    public static void main(String[] args) {
        int [] a={0,1,2,3,4,5,6};
        int sum=7;
        int count=0;
        Arrays.sort(a);
        for(int i=0;i<a.length-2;i++){
            for(int j=i+1;j<a.length-1;j++){
                for(int k=j+1;k<a.length;k++){
                    if(a[i]+a[j]+a[k]==sum){
                        System.out.println(a[i]+" "+a[j]+" "+a[k]);
                        count++;
                    }
                    }
            }
            
        }
        System.out.println(count);
    }
}
