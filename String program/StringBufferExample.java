public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("hello ");
        sb.append("Java");
        sb.insert(5," world");
        sb.reverse();
        System.out.println(sb.capacity());
    }
}
