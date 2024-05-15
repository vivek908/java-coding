//earger way to create singleton pattern
public class Jalebi {
    private static Jalebi jalebi=new Jalebi();
    public static Jalebi getJalebi(){
        return jalebi;
    }
}
