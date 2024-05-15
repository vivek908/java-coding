public class Test1 {
    //shalo copy and deep copy
        public static void swap(int []a,int i,int j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        public static void main(String args[])
        {
                int a[]={0,1,0,2,0,1,0,1,2,0,2,0,0,1,1,2,0,1,0};
                int left=0,i=0;
                int right=a.length-1;
                while(i<=right){
                    if(a[i]==0){
                        swap(a, i, left);
                        left++;
                        i++;
                    }
                    else if(a[i]==2){
                        swap(a,i,right);
                        right--;
                    }
                    else{
                        i++;
                    }
                }
    
                for(i=0;i<a.length;i++){
                    System.out.print(a[i]+" ");
                }
        }
    }
