
public class Q28 {
    public static void main(String[] args){
        double d =8345678.876d;
        String str=Double.toString(d);
        Double di=Double.valueOf(d);
        String str2= new String("4567.765");
        Double di2= Double.valueOf(str2);
        System.out.println(Double.toHexString(d));
        long l= Double.doubleToLongBits(d);
        System.out.println(Long.toBinaryString(l));
        System.out.println(Long.toOctalString(l));


    }
}
