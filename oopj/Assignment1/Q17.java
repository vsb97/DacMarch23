//Write a program to convert state of Integer instance into
//byte, short, int, long, float and double.
public class Q17 {
    public static void main(String args[]){
            Integer i =new Integer(1234);
            byte b= i.byteValue();
            short s= i.shortValue();
            System.out.println("Byte "+b+" \n short: "+s);
            System.out.println("int:"+((int)i));
            long l = (long)i;
            System.out.println("long:"+l);
            float f= (float)i;
            System.out.println("float:"+f);
            double d =(double)i;
            System.out.println("int:"+d);

    }
}
