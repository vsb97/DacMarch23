
public class Q24 {
    public static void main(String args[]){
        float f =345.56f;
       // float value into String
       String str = Float.toString(f);
       System.out.println(str);
        //b. float value into Float instance.
        Float fi=Float.valueOf(f);
        System.out.println(fi);
        //c. String instance into Float instance.
        String str2 = new String("7864.65");
        Float fi2= Float.valueOf(str2);
        System.out.println(fi2);
        //d. float value into hexadecimal string.
        System.out.println("hexadecimal: "+Float.toHexString(f));
    }
}
