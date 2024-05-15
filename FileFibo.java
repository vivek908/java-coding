
// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946
public class FileFibo {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,11};
        boolean result;
        for(int i=0;i<a.length;i++){          
             result=isFibonicai(a[i]);
             if(result==true){
                a[i]=i+1;
             }
             
        }
        
    }
    public static boolean isFibonicai(int n){
       int a=0,b=1;
       while (a<n) {
        int temp=b;
        b=a+b;
        a=temp;
       }
       return a==n;
    }
}
