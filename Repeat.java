import java.util.HashMap;
import java.util.Map;

public class Repeat {
    public static void main(String[] args) {
        String s="ashokkumar";
        Map<Character,Integer> map=new HashMap<>();
        char charArr[]=s.toCharArray();
        for(char c:charArr){
                map.put(c, map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>1)
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
