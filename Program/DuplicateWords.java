import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWords {
    public static void main(String[] args) {
        String statements = "Vivek is java developer and angular developer";
        Map<String,Long> duplicateWordsCount=countDuplicate(statements);
    
        for(Map.Entry<String,Long> entry: duplicateWordsCount.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        } 
    }       
private static Map<String,Long> countDuplicate(String input){
   return Arrays.stream(input.toLowerCase().split(" "))
    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
    .entrySet().stream().filter(e->e.getValue()>0)
    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
}
}
