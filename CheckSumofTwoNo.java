import java.util.HashSet;
import java.util.Set;

public class CheckSumofTwoNo {
    public static void main(String[] args) {
        int a[]={3, 34, 4, 12, 5, 2};
        boolean result=checkSum(a);
        System.out.println(result);
    }
    private static boolean checkSum(int[] numbers){
        Set<Integer> set=new HashSet<>();
        for(int num:numbers){
            if(set.contains(9-num)){
                return true;
            }
            set.add(num);
        }
        return false;
       
    }
}
