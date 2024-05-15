import java.util.List;
import java.util.ArrayList;

public class StringExample {
    public static void main(String[] args) {
        String str="Welcome to javatpoint";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='t'){
                count++;
            }
        }
        System.out.println("frequency of t is : "+count);
        System.out.println(str.substring(3, 8));
        System.out.println(str.contains("javatpoint"));
        String str1=String.join("-","welcome","to", "javatpoint");
        System.out.println(str1);
        List<String> list=new ArrayList<>();
        list.add("mukesh");
        list.add("vivek");
        for(String str3:list){ 
                System.out.println(str3);
            }
            String words[]=str.split(" ");
            for(String s4:words){
                System.out.println(s4);
            }
        }
    }
