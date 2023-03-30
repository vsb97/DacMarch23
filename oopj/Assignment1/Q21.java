//21.Write a program to convert state of Long instance into byte,
//short, int, long, float and double.
public class Q21 {
    public static void main(String args[]){
        Long i=new Long("23456789");
        byte b=i.byteValue();
        short s=i.shortValue();
        int a= i.intValue();
        long c = i;
        float f =i.floatValue();
        double d =i.doubleValue();

    }
}
