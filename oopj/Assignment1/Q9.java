//9.Write a program to convert state of Byte instance into byte,short, int. long, float and double.
class Q9{
    public static void main(String args[]){

        Byte b=new Byte((byte)20);
        //byte
        byte a=b.byteValue();
        System.out.println("Byte instance to byte: "+a);
        //short
        short s=b.shortValue();
        System.out.println("Byte instance to short: "+s);
        //int
        int i=b.intValue();
        System.out.println("Byte instance to int: "+i);
        //long
        long l=b.longValue();
        System.out.println("Byte instance to long: "+l);
        //float
        float f=b.floatValue();
        System.out.println("Byte instance to float: "+f);
        //double
        double d=b.doubleValue();
        System.out.println("Byte instance to double: "+d);


    }
}