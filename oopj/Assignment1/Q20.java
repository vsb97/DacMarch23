public class Q20 {
    public static void main(String args[]){
        long a= 7856653726L;
        //long value into String
        String s=Long.toString(a);
        System.out.println("long-->string :"+s);
        //b. long value into Long instance.
        Long i = Long.valueOf(a);
        System.out.println("long-->long instance: "+i);
        //c. String instance into Long instance.
        String str = new String("8765438765");
        Long k=Long.valueOf(str);
        System.out.println("str instance-->long instance: "+k);
        //d. long value into binary, octal and hexadecimal string.
        System.out.println("Binary "+Long.toBinaryString(a));
        System.out.println("octal "+Long.toOctalString(a));
        System.out.println("hexadecimal "+Long.toHexString(a));
    }
}
