public class Q16 {
    public static void main(String args[]){
        int i=10;
        //int value into String
        String str= Integer.toString(i);
        //b. int value into Integer instance.
        Integer ii= Integer.valueOf(i);
        //. String instance into Integer instance.
        String str1=new String("1234");
        Integer g =Integer.valueOf(str1);
        //d. int value into binary, octal and hexadecimal string.
        System.out.println("Binary: "+Integer.toBinaryString(i));
        System.out.println("Hexadecimal: "+Integer.toHexString(i));
        System.out.println("Octal: "+Integer.toOctalString(i));
    }
}
