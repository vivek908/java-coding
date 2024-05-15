//singlaton pattern using lazy initialization
//key points: 1. constructor is private [no object creation from contructor]
//2. object create with the help of method
//3. create private field to store object

// enum Samosa{
//     INSTANCE;
// }


import javax.management.RuntimeErrorException;

public class Samosa {

     private static Samosa samosa;

    private Samosa() {
        if (samosa != null) {
            throw new RuntimeErrorException(null, "you are trying to break singleton pattern");
        }
    }

    public static Samosa getSamosa() {

        if (samosa == null) {
            synchronized (Samosa.class) {
                samosa = new Samosa();
            }
        }
        return samosa;
    }

}
