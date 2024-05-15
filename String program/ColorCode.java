
//import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ColorCode {
    public static void main(String[] args) {
        //Arrays.asList("green","yellow","blue","green");
        List<String> colorname=List.of("green","yellow","blue","green");
        List<String> sortedColor=colorname.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
        sortedColor.forEach(t->System.out.println(t));
        
    }
    
}
