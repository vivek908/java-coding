public class MaxSubArray {

    private static int maxSubArraySum(int[] a) {
        int max=0,sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum<0){
                sum=0;
            }
            else if(max<sum){
                max=sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a[]=new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result=maxSubArraySum(a);
        System.out.println(result);
    }
}
