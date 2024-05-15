import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        
    // int a[]={1,2,8,3,2,2,2,5,1};
    // Map<Integer,Integer> frequencyMap=new HashMap<>();
    // for(int num:a){
    //     frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);
    // }
    // for(Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()){
    //     System.out.println(entry.getKey()+"->"+entry.getValue());
    // }
    String[] words={"vivek","sonam","swati","sonam","sonam"};
    Map<String, Integer> wordFreqMap = new HashMap<>();
    for (String word : words) {
    wordFreqMap.put(word, wordFreqMap.getOrDefault(word, 0) + 1);
    wordFreqMap.forEach((key,value)->System.out.println(key+" "+value));
}
}
}
