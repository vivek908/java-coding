public class MaxSubArray1 {
    public static void main(String[] args) {
        int arr[]={-3,2,5,6,-10};
        int result=findMaxSubArray(arr);
        System.out.println(result);
    }
    public static int findMaxSubArray(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        int end=0;
        int start=0;
        int s=0;
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum+=arr[i];
            if(currentSum>maxSum){
                maxSum=currentSum;
                start=s;
                end=i;
            }
            if(currentSum<0){
                currentSum=0;
                s=i+1;
            }
        }
        int []maxSubArray=new int[end-start+1];
        int sum=0;
        for(int i=start;i<=end;i++){
            maxSubArray[i-start]=arr[i];
            sum+=maxSubArray[i-start];            
        }
        return sum;
    }
}
