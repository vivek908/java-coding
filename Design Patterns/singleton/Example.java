// import java.lang.reflect.Constructor;

public class Example {
    public static void main(String[] args) throws Exception {
        // Samosa samosa1=Samosa.getSamosa();
        // System.out.println(samosa1.hashCode());
        // Samosa samosa2=Samosa.getSamosa();
        // System.out.println(samosa2.hashCode());

        // Jalebi jalebi1=Jalebi.getJalebi();
        // System.out.println(jalebi1.hashCode());
        // Jalebi jalebi2=Jalebi.getJalebi();
        // System.out.println(jalebi2.hashCode());

        
        /*
        Reflection API to break singleton pattern
         */ 
        // Samosa samosa=Samosa.getSamosa();
        // System.out.println(samosa.hashCode());
// How to prevent Singleton Pattern from Reflection, Serialization and Cloning?
        // Reflection 
        // Constructor<Samosa> constructor=Samosa.class.getDeclaredConstructor();
        // constructor.setAccessible(true);
        // Samosa s2=constructor.newInstance();
        // System.out.println(s2.hashCode());
    }
 

}
