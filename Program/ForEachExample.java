import java.util.HashSet;
import java.util.Set;

class ForEachExample{
    public static void main(String[] args) {
        Set<Integer> list=new HashSet<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.forEach(System.out::println);
    }
}