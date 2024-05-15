import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String args[]){
        Map<String,Integer> map=new TreeMap<>();
        System.out.println(map.size());
        map.put("a",0);
        map.put("q",2);
        map.put("q",1);
        //iteration
        // map.forEach((key,value)->System.out.println("key= "+key+" value= "+value));
        // for(Map.Entry<String,Integer> entry:map.entrySet()){
        //     System.out.println(entry.getKey()+" "+entry.getValue());
        // }
        map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey())
        .forEach(System.out::println);
    }
}
