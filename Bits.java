import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {
        
        // int n=5;
        // int position=3;
        // int bitMask=1<<position;

        // get bit
        // if((bitMask&n)==0){
        // System.out.println("postion is zero");
        // }
        // else{
        // System.out.println("positon is 1");
        // }
        // set bit
        // System.out.println(bitMask|n);
        // clear bit
        // int n = 5;
        // int position = 0;
        // int bitMask = 1 << position;
        // int notBitMask = ~(bitMask);
        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);
        //update bit  operation=1 set, operation=0 clear 
        Scanner input=new Scanner(System.in);
        int oper= input.nextInt();
        int n=5;
        int pos=1;
        int bitMask=1<<pos;
        if(oper==1){
            System.out.println(bitMask|n);
        }
        else{
                int notBitMask=~(bitMask);
                System.out.println(notBitMask&n);
        }
        input.close();
    }
}
